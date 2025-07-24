package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // chamando contrutor de outra classes
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        }
    }
    @Override /* Usar override para o compilador entender que é uma sobrepossição
    do metodo "withdraw" da classe "Account",
    (boa pratica pois caso o programador erre o nome do metodo
    a IDE nao acusa erro pois achara que é um metodo especifico da classe "SavingsAccount"
    porem a classe nao funcionara como esperado) */
    public void withdraw(double amount){
        super.withdraw(amount); // aproveira a logica da superclasse descontando mais 2 dos 5 que ja foram descontados, entao descontase 7
        balance -= 2.0;
    }
}
