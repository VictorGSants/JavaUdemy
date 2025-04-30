import entities.application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voçê quer digitar? ");
        int n = sc.nextInt();
        int posMaior;


        application vect[] = new application[n];

        for (int i = 0; i< vect.length; i++){
            System.out.println("Digite um numero: ");
            double num = sc.nextInt();
            vect[i] = new application(num);
        }

        double maior = vect[0].getNum();
        posMaior = 0;

        for (int i = 0; i< vect.length; i++){
            if (vect[i].getNum() > maior){
               maior = vect[i].getNum();
               posMaior = i + 1; // pois o vetor começa com 0
            }
        }

        System.out.println("Maior valor: "+ maior);
        System.out.println("Posição do maior valor: "+ posMaior);
    }
}