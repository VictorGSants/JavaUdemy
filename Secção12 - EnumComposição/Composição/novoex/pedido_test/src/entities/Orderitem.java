package entities;

public class Orderitem {

    private Integer quantity;
    private Double price;

    private products product;
    public Orderitem(){}

    public Orderitem(Integer quantity, Double price, products product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public products getProduct() {
        return product;
    }

    public void setProduct(products product) {
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return getProduct().getProductName() + ", "+ "R$: " + price+ "0" + "  Quantity: "+ quantity+", "+ "Subtotal:  R$: "+subTotal()+ "0";

    }
}
