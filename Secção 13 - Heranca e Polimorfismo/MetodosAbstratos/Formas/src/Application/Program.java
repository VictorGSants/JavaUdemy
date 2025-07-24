package Application;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import Enum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Shape #" + i + " Data");
            System.out.print("Retangle or Circle? (r/c) ");
            char x = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            if (x == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Retangle(color, width, height));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));

            }

        }
        System.out.println("- - - - - - - - - - - - ");
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(shape.area());
        }
    }
}