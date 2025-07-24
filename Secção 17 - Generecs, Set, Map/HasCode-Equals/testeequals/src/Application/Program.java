package Application;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("bob", "maria@gmail.com");

        Client c2 = new Client("bob", "Victor@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}