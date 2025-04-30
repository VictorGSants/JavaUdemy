import entities.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        application vect[] = new application[n];
        int cont = 0;
        for (int i = 0; i<vect.length; i++){
            cont ++;
            System.out.println("Dados da "+cont+"° pessoa: ");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new application(name, age, height);
        }
        int sum = 0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getHeight();
        }
        System.out.println("Altura média: "+ sum/vect.length);

        int soma = 0;

        for (int i = 0; i< vect.length; i++){
            if (vect[i].getAge() < 16){
                soma++;
            }
        }
        double porcent = ( soma * 100.0) / vect.length;
        System.out.println("pessoas com menos de 16 anos: "+ porcent+"%");

        for (int i = 0; i< vect.length; i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }




    }
}