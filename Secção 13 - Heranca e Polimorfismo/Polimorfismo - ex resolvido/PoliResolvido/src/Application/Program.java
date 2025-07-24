package Application;

import Entities.Employee;
import Entities.OutsourcedEmploee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the numbers of employess");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced? (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            if (outsourced == 'y'){
                System.out.print("additionalCharge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmploee(name, hours, valuePerHour, additionalCharge));
            }else {

                list.add( new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMANTS");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + emp.paymant());
        }
    }
}