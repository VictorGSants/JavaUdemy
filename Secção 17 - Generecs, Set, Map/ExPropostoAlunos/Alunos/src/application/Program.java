package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int students = sc.nextInt();
        for (int i = 1; i<= students; i++){
            int number = sc.nextInt();
            a.add(number);
        }
        System.out.print("How many students for course B? ");
        students = sc.nextInt();
        for (int i = 1; i<= students; i++){
            int number = sc.nextInt();
            b.add(number);
        }
        System.out.print("How many students for course C? ");
        students = sc.nextInt();
        for (int i = 1; i<= students; i++){
            int number = sc.nextInt();
            c.add(number);
        }
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        System.out.println("Studenst: " + total.size());



        sc.close();
    }
}