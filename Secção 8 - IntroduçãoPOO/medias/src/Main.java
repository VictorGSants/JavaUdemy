import notas.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        application notas = new application();
        System.out.println("Name: ");
        notas.name = sc.next();
        notas.n1 = sc.nextDouble();
        notas.n2 = sc.nextDouble();
        notas.n3 = sc.nextDouble();

        System.out.println(notas);


    }
}