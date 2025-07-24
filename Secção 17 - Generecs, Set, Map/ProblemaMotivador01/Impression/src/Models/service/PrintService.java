package Models.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // aceita todods os tipos

    private List<T> list = new ArrayList<>(); // nao sabe qual tipo sera guardado dentro da lista, apenas na hora da instanciação

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}