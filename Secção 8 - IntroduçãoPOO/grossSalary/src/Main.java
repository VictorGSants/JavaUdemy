import application.functions;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        functions application = new functions();

        System.out.println("Name");
        application.name = sc.next();
        System.out.println("Gross salary: ");
        application.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        application.tax = sc.nextDouble();

        System.out.println("Employee: "+ application);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble() ;
        application.increaseSalary(percentage);

        System.out.println("Update data: "+ application);
    }
}