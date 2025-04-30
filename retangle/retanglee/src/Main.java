import aplication.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        aplication meassure = new aplication();

        System.out.println("Enter retangle Width and height: ");
        meassure.width = sc.nextDouble();
        meassure.height = sc.nextDouble();


        System.out.println(meassure);




    }
}