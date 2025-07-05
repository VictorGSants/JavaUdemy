package application;

import OrderStatus.OrderStatus;
import entities.Client;
import entities.Orderitem;
import entities.order;
import entities.products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        Instant d01 = Instant.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm").withZone(ZoneId.systemDefault());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        // dados do cliente
        System.out.println("ENTER CLIENT DATA: \n");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date dateBirth = sdf.parse(sc.next());
        Client client = new Client(name, email, dateBirth);

        // dados do pedido
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        order Order = new order(new Date(), status, client);

        System.out.print("How many itens to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products product = new products(productName, productPrice);
            Orderitem it = new Orderitem(quantity,productPrice,product);
            Order.addItem(it);

        }
        System.out.println("ORDER SUMARY: ");
        System.out.println(Order);





    }
}