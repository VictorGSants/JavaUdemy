import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("c:temp/in.txt");

        Scanner sc = null; /* instanciar sccaner a partir do arquivo,
                            apartir do momento que instanciar o programa tenta abrir o arquivo,
                            o que pode ocasionar em uma exeção entao precisa por a abertura dentro do try

            */

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {// testa se tem uma nova linha no arquivo
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }// colocar o fechamento do recurso no finnaly pois é certeza que vai fechar
        }

    }
}