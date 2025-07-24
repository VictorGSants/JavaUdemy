import entities.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        application[] vect = new application[n]; // criação do vetor

        for (int i = 0; i<vect.length; i++){
            int num = sc.nextInt();
            vect[i] = new application(num); // guardar valores em um vetor
        }
        System.out.println("Numeros Negativos: ");
        for (int i = 0; i<vect.length; i++){
            if (vect[i].getNum() < 0){
                System.out.println(vect[i].getNum());
            }
        }







    }
}