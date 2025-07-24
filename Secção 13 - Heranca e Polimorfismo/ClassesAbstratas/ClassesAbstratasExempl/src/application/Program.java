package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

      /* a linha 19 substitui a necessidade de criar uma variavel dentro da classe account, pois com o LIST<ACCOUNT>
      ela ja é instanciada dentro da subclasse pertencente:

      Account acc1 = new BusinessAccount(1000, "Maria", 1000.0, 500.0);
      Account acc2 = new SavingsAccount(1002, "Victor", 1000.0, 0.02);
      Account acc3 = new BusinessAccount(1003, "Neuza", 1000.0, 500.0);
      Account acc4 = new SavingsAccount(1004, "Mariana", 1000.0, 0.02);
*/
        List<Account> list = new ArrayList<>();
        list.add(new BusinessAccount(1000, "Maria", 1000.0, 500.0));
        list.add(new SavingsAccount(1002, "Victor", 1000.0, 0.02));
        list.add(new BusinessAccount(1003, "Neuza", 1000.0, 500.0));
        list.add(new SavingsAccount(1004, "Mariana", 1000.0, 0.02));

        int sum = 0;
        for (Account acc : list){
            sum += acc.getBalance();
        }
        System.out.println("Totalizando saldo de todas as contas: "+ sum);

        for (Account acc : list){
            acc.deposit(10);
            System.out.println(acc.getHolder() + " - R$: " + acc.getBalance());
        }
    }


}

