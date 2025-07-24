import entities.application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor?:");
        int n = sc.nextInt();

        application vectA[] = new application[n];
        application vectB[] = new application[n];
        application vectC[] = new application[n];
// Criou os 3 vetores

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            double valorA = sc.nextDouble(); // valores do vetor A
            vectA[i] = new application(valorA); // Armazena valores no vetor
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            double valorB = sc.nextDouble();
            vectB[i] = application.fromVetor2(valorB);
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i++) {
            double soma = vectA[i].getVetor1() + vectB[i].getVetor2();
            vectC[i] = application.fromVetor3(soma);
            System.out.println(vectC[i].getVetor3());
        }

        sc.close();
    }
}
