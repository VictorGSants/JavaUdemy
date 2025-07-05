package entities;

import entitiesEnum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Tem um:
    private Departaments departaments;

    /*Tem varios:
     Instanciar ja na declaração do atributo
     Já começa vazia */

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    // Gerar o construtor sem a lista "Contracts" Iniciar a lista na declaração
    public Worker(String name, WorkerLevel level, Double baseSalary, Departaments departaments) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departaments = departaments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departaments getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departaments departaments) {
        this.departaments = departaments;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


/* Apagar o metodo SET pois a lista de contratos nao pode ser alterada

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
*/


    // METODOS DA CLASSE WORKER:

    public void addContract(HourContract contract){
        contracts.add(contract);
        // Adicionar o contrato na lista
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
        // Remove o contrato da lista
    }

    // metodo para saber quanto ele ganhou em determinado mes
    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance(); // criou um calendario
        for (HourContract c : contracts){
            cal.setTime(c.getDate()); // Para cada contrato SETA uma data
            int c_year = cal.get(Calendar.YEAR); // representa o ano do contrato "C"
            int c_month = 1+ cal.get(Calendar.MONTH); // Representa o mes do contrato "C"
            if (year == c_year && month == c_month){
                sum += c.totalValue(); // acumula na "SUM" os valores dos contratos
            }
        }
        return sum;
    }
}
