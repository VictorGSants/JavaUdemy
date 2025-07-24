package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
      /*  Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0,500.00);

        //UPCASTING

        Account acc1 = bacc; // Não da erro pq a bussinessAccount é uma conta.
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
    // Pegar o objeto que é da subclasse e atribuilo para uma variavel da superclasse


        //DOWCASTING:
        //Casting natural
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        // InstanceOf = testa pra ver se a variavel faz parte da classe BussinesAccount
        // no caso, falhou e nao seguiu com a operação. e pulou para o prox IF
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.printf("Loan !");
            }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.printf("Update ");
            }
        */

        // Sobreposição:
        Account acc1 = new Account(1000, "Alex", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        // metodo OVERRIDE
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());
        // Metod Super
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }


}

