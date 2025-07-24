package Application;

import entities.PssFisica;
import entities.PssJuridica;
import entities.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<Tax> list = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            System.out.println("Tax payer #" +i + " data:");
            System.out.print("Individual or company (i/c) ? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (x == 'i'){
            System.out.print("Health expenditures: ");
            Double medicinal = sc.nextDouble();
            list.add(new PssFisica(name, anualIncome, medicinal));
            }else {
                System.out.print("Number of employees:");
                int employee = sc.nextInt();
                list.add(new PssJuridica(name, anualIncome, employee));
            }
        }
        double sum = 0;
        System.out.println();
        for (Tax tax : list){
            sum += tax.taxa();
            System.out.println(tax.getName() + ": $ " + tax.taxa());
        }
        System.out.println("Total taxas: " + sum);











    }
}