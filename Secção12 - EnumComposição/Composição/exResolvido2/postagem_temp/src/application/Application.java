package application;

import entities.coment;
import entities.post;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
        public static void main(String[] args) throws ParseException {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                coment c1 = new coment("Have a nice trip !");
                coment c2 = new coment("Wow that's awesome !");
                post p1 = new post(
                        sdf.parse("21/06/2025 14:05:22"),
                        "Traveling to New Zeland",
                        "I'm going to visit this wonderful country! ",
                        12);
                p1.addComent(c1);
                p1.addComent(c2);

                coment c3 = new coment("Good Night !");
                coment c4 = new coment("May the force be with you");
                post p2 = new post(
                        sdf.parse("22/07/2027 15:02:12"),
                        "Good Night guys",
                        "See you tomorrow",
                        5);
                p2.addComent(c3);
                p2.addComent(c4);
                System.out.println(p1);

                System.out.println(p2);
        }
}