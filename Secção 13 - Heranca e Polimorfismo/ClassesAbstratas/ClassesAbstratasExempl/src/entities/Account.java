package entities;

public abstract class Account { // "ABSTRACT" seignifica que não essa classe nao podera ser instanciada.
    private  Integer number;
    private String holder;
    protected Double balance; /* pois precisou ser utilizado em outra classe, porem nao pode por "Public"
pois nao sao  todos que devem poder acessar apenas a classe EXTENDS */
    public Account(){

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
