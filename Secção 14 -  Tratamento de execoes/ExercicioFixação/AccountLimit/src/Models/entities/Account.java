package Models.entities;

import Models.exeptions.DomainExeptions;

public class Account {
    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}

    public Account(Integer number, String name, Double balance, Double withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double setBalance(){return balance;}

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double setWithdrawLimit(){return withdrawLimit;}

    public void deposit(Double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws DomainExeptions {
        Withdraw(amount);
        balance -= amount;
    }
    public Double Withdraw(Double amount) throws DomainExeptions{
        if (getBalance() < amount){
            throw new DomainExeptions("Saldo insuficiente");
        }
        if (getWithdrawLimit() < amount){
            throw new DomainExeptions("Limite insuficiente");
        }
        return balance -= amount;
    }
    @Override
    public String toString(){
        return "New Balance: " + getBalance();
    }

}
