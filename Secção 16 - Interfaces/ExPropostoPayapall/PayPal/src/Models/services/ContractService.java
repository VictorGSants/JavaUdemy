package Models.services;

import Models.entities.Contract;
import Models.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService; // pois depende da classe onlinePaymentService

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicInstallment = contract.getTotalVelue() / months; // VALOR DA PARCELA

        for (int i = 1; i<= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i); // variavel responsavel por acrescentar mais um mes
            // data de vencimento ^

            double interest = onlinePaymentService.interest(basicInstallment, i); // variavel responsavel por cobrar o juros mes a mes

            double paymentFee = onlinePaymentService.paymentFee(basicInstallment + interest); // variavel responsavel por cobrar taxa no pagamento de 2%

            double quota = basicInstallment + interest + paymentFee; // soma tudo

            contract.getList().add(new Installment(dueDate, quota)); // adiciona na lista
        }
    }
}
