package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) {

        /*
        <T extends Comparable<T>> | O tipo genérico T precisa saber se comparar com ele mesmo
        essa classe extende delimita o que o tiopo T vai aceitar, poderia ser por exemplo NUMBER
         T max(List<T> list)      | O metodo recebe uma lista e devolve o maior valor|

        * */


        if (list.isEmpty()) { // se a lista estiver vazia
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0); // o maior valor é o primeiro
        for (T item : list) { // percorrer lista
            if (item.compareTo(max) > 0) { // confere se o primeiro valor é maior que o segundo
                max = item; // se sim, o segundo valor passa a ser o maior valor
            }
        }
        return max; // retorna o maior valor
    }
}