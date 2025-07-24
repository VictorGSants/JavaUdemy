package Application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.println("Enter full file path:");
        String path = sc.next();


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();

            }
            double media = list.stream() // cria uma stream com o conteudo da lista
                    .map(p -> p.getPrice()) // o metodo map, trabalha com streams, pegando o preco
                    .reduce(0.0 ,(x,y) -> x+y) // reduce: metodo de soma iniciando em 0, que soma dois valores x e y
                    / list.size();
            System.out.println("Average price: " + media);

            Comparator<String> comp = (o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()); // criou um metodo para comparar e colocar em ordem alfabetica

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);


        }


        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        sc.close();
    }
}