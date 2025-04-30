import Entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n]; //criacao do vetor

        for (int i = 0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine(); // ler os produtos
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); // guardar nas posições do vetor
        }
        double sum = 0;
        for (int i = 0; i<vect.length; i++){
            sum += vect[i].getPrice(); // pegando apenas o preco dos vetores
        }
        double media = sum/vect.length;
        System.out.printf("AVARAGE PRICE: %.2f",media);
    }
}