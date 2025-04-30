import entities.application;

import java.util.Scanner;
// NUMEROS PARES
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voçê vai digitar? ");
        int n = sc.nextInt();
        int nPares = 0;
        int cont = 0;
        application vect[] = new application[n];
        for (int i = 0; i<vect.length; i++){
             System.out.println("Digite um numero: ");
             int num = sc.nextInt();
             vect[i] = new application(num);
             if (num % 2 == 0){

                 cont++;
             }
        }
        System.out.println("Numeros pares: ");
        for (int i = 0; i< vect.length; i++){
            if (vect[i].getNum() % 2 == 0){
                System.out.println(" "+ vect[i].getNum());
            }
        }

        System.out.print("Quantidade de pares: "+ cont);
    }
}