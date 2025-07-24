import dadosBank.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        application application;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0); // ler a resoposta do usuario 
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            application = new application(number, holder, initialDeposit); // Criação do construtor principal
            System.out.println(application);
        }
        else {
            application = new application(number, holder); // construtor secundario (sobrecarga)
            System.out.println("Account data: ");
            System.out.println(application);
        }
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        application.deposits(depositValue); // Chamada para realizar a operação
        System.out.println("Updated account data: ");
        System.out.println(application);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        application.withdrawal(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(application);



    }
}