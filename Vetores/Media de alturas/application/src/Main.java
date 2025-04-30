import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       double[] vect = new double[n]; // criação do vetor
        for (int i = 0; i<n; i++ ){
            vect[i] = sc.nextDouble();
        }
       double som = 0.0;
        for (int i = 0 ; i<n; i++){ //soma dos vetores
            som += vect[i];
        }
        double media = som/n;
        System.out.printf("AVERAGE RATE %.2f%n", media);
    }
}