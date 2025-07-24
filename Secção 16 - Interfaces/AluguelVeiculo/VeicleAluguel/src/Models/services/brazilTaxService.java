package Models.services;

public class brazilTaxService implements TaxService{
    public double tax(double amount){
        if (amount <= 100){
            return amount * 0.20;
        }
        else {
            return amount * 0.15;
        }
    }
}
