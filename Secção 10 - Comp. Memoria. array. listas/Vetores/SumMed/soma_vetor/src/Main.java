import entities.products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voçê quer digitar? ");
        int n = sc.nextInt();

        products[] vect = new products[n];
        
        for (int i = 0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            vect[i] = new products(num);
        }

        System.out.println("Valores: ");
        for (int i = 0; i< vect.length; i++){
            System.out.print(vect[i].getNum());
            System.out.print(" - ");
        }

        int sum = 0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getNum();
        }
        System.out.print("Soma: "+ sum);
        System.out.println(" Media: "+ sum/vect.length);

    }
}