package application;

import entidades.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(126, new Date(), OrderStatus.PENDING_PAYMENT);
        // Instanciando o id, data e o status do pedido
        System.out.println(order);

        // passando string para enum:

        OrderStatus os1 = OrderStatus.DELIVERED;
        // caso digitasse outro nome, daria erro. 
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}