package Application;

import Models.entities.Contract;
import Models.entities.Installment;
import Models.services.ContractService;
import Models.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy)");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(number,date,valueContract);

        System.out.print("Entre com o numero de parcelas: ");
        int numberInstallment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numberInstallment);

        for (Installment installment : contract.getList()){
            System.out.println(installment);
        }

        sc.close();
    }
}