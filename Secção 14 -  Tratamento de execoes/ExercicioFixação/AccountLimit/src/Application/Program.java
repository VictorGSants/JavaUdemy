package Application;

import Models.entities.Account;
import Models.exeptions.DomainExeptions;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = null;
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("======================");


            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.Withdraw(amount);


        } catch (DomainExeptions e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(account.toString());


        sc.close();
    }
}