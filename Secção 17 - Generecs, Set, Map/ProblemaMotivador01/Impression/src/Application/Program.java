package Application;

import java.util.Scanner;

import Models.service.PrintService;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>(); // define que o tipo vai ser INTEGER

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print(); // elimina a necessidade de casting
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}