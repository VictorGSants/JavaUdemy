package entities;

import OrderStatus.OrderStatus;
import application.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class order {

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<Orderitem> itens = new ArrayList<Orderitem>();

    public order(){}

    public order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public order(String format) {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(Orderitem item){
        itens.add(item);
    }
    public void removeItem(Orderitem item){
        itens.remove(item);
    }

    public double total(){
        double sum = 0;
        for (Orderitem it : itens){
            sum += it.subTotal();
            // reaproveitar a classe subtotal
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (Orderitem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}

