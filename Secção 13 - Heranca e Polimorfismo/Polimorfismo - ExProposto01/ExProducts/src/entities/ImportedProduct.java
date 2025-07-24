package entities;

public class ImportedProduct extends Product{
    private Double custonsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double custonsFee) {
        super(name, price);
        this.custonsFee = custonsFee;
    }
    public double totalPrice(){
        return custonsFee * getPrice();
    }
    @Override
    public String priceTag(){
        return getName() + " $ " + getPrice() + " (Customs fee: R$" + custonsFee + ")";
    }
}
