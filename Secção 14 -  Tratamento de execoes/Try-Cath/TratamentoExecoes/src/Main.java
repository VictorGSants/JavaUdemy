import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method2();
        System.out.println("fim");

    }
    public static void method2(){
        System.out.println("Metod 1 start");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position + - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace(); // faz com que o cpompilador mostre o rastreamento do streck, mostra o erro sem finalizar o programa
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }
        sc.next();

        System.out.println("metod 1 finshed");
    }
}