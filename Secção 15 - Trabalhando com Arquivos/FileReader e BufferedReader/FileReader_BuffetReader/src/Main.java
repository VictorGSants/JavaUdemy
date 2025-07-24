import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "c:/temp/in.txt";

        /*
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); // o BuffedReader é instanciado a partir do FileReader

            String line = br.readLine(); // le uma linha do arquivo, e se o arquivo estiver no final, retorna nulo

            while (line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }

        // para fechar as streamers:
        finally {
            try {
                if (br!= null){
                    br.close();
                }
                if (fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         */
        // instancia as streamers diretamente no bloco try, sem a necessidade de  precisar fechar com finally, muito mais simples
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine(); // le uma linha do arquivo, e se o arquivo estiver no final, retorna nulo

            while (line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }



    }

}