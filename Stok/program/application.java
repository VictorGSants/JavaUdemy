package Stok.program;

import Stok.products;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");

        String name = sc.next();

        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();


        products product = new products(name, price, quantity);


        System.out.println("Product data: "+ product);

        System.out.println("Enter the number of product to be added in stock: ");
        int quantityAdd = sc.nextInt();
        product.addProducts(quantityAdd);
        System.out.println("Update data: "+ product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int quantityRemove = sc.nextInt();
        product.removeProducts(quantityRemove);
        System.out.println("Update data: "+ product);
    }
}
