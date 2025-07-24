package Application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i = 1; i<=n; i++){
            System.out.println("Product #"+ i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (x == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }else if(x == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));
            }else {
                list.add(new Product(name,price));
            }

        }
        System.out.println();
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }
    }
}