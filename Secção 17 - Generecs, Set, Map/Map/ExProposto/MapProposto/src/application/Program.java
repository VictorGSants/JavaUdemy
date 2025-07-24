package application;

import entities.Candidato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path:");
        String path = sc.next();

        try {
            Map<String, Integer> map = new HashMap<>();

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while ( line != null){
                String[] fields = line.split(",");
               // String name = fields[0];
                //int votos = Integer.parseInt(fields[1]);
                Candidato candidato = new Candidato(fields[0], (Integer.parseInt(fields[1])));
                //Candidato candidato = new Candidato(name, votos);

                if (map.containsKey(fields[0])){ // se o candidato ja tiver votos, (TRUE), soma os votos com os que ele ja tem
                    int votesSoFar = map.get(fields[0]);
                    map.put(fields[0], (Integer.parseInt(fields[1])) + votesSoFar);
                }
                else{ // se nao apenas colocase os primeiros votos
                map.put(candidato.getName(), (Integer.parseInt(fields[1])));
                }
                line = br.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }


        sc.close();
    }
}