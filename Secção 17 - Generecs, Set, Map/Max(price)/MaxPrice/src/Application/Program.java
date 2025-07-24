package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>(); // cria uma lista de produtos

        String path = "C:\\temp\\in.txt"; // le o caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // abre o arquivo

            String line = br.readLine(); // le a primeira linha
            while (line != null) { // verifica se existe proxima linha
                String[] fields = line.split(","); // cria um vetor de strings separado por ","
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); /*Adiciona na lista os vetores criados
                separados por virgula / 0 = Name / 1 = price */
                line = br.readLine();
            }

            Product x = CalculationService.max(list); // pega o maior valor da lista (pelo preço)
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}