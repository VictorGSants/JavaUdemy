package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; // instancia a matriz na memoria
        for (int i = 0; i<mat.length; i++){ // percorre as linhas da matriz
            for (int j = 0; j<mat[i].length; j++){ // percorre a coluna da matriz

                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0 ){
                    negative += 1;
                }
            }
        }
        System.out.println("Main Diagonal: ");
        for (int i = 0; i<mat.length; i++){
            System.out.print(mat[i][i] + " ");// pois a diagonal principal sempre vai ser os mesmos numeros representantes de linhas e colunas
        }
        System.out.println("");
        System.out.println("Negative numbers: "+negative);
    }
}