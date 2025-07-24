package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    }
    @Override /* Usar override para o compilador entender que é uma sobrepossição
    do metodo "withdraw" da classe "Account",
    (boa pratica pois caso o programador erre o nome do metodo
    a IDE nao acusa erro pois achara que é um metodo especifico da classe "SavingsAccount"
    porem a classe nao funcionara como esperado) */
    public final void withdraw(double amount){
        balance -= amount;
        /* CONVEM ACRESCENTAR "FINAL" EM METODOS SOBREPOSTOS
         POIS SOBREPOSIÇÕES MULTIPLAS PODEM SER PORTAS DE ENTRADAS PARA INCONSISTENCIAS.

         METODOS "FINAL" TAMBEM DEIXA O PROGRAMA MAIS RAPIDO POIS NAO PRECISA MAIS LER
         NENHUM ATRIBUTO, COMO EXEMPLO: STRING
    */}
}
