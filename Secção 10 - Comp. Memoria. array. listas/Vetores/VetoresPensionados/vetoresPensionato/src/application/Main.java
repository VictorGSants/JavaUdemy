package application;

import entities.rents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        rents[] vect = new rents[10]; // Criação do vetor de 10

        for (int i = 1; i <= n; i++){ // laco para percorrer o vetor

            System.out.println("Rent #"+ i); // Contador para numero de alugueis
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rents Rent = new rents(name, email); // Instanciação da outra pagina
            vect[room] = Rent; // faz o numero do quarto ser o numero do vetor
        }
        System.out.println("");
        System.out.println("Busy rooms: ");
        for (int i = 1; i < 10; i++){
            if (vect[i] !=  null){
            System.out.println(i + ": "+ vect[i]);
        }
        }


    }
}