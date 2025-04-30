package dadosBank;

public class application {

    private int numberAcont;
    private String name;
    private double balance;

    public application(int numberAcont, String name, double initialDeposit) {
        this.numberAcont = numberAcont;
        this.name = name;
        deposits(initialDeposit);
    }

    public application(int numberAcont, String name) {
        this.numberAcont = numberAcont;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberAcont() {
        return numberAcont;
    }

    public double getBalance() {
        return balance;
    }


    public void deposits(double amount){
        balance += amount;
    }
    public void withdrawal(double amount){
        balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account: "+ numberAcont+", Holder: "+ name+", Balance: "+ balance;
    }
}
