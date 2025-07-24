import entities.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <employee> list = new ArrayList<>(); // criou a lista no arquivo "Employee"
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++ ){
            System.out.println("Employee "+ (i + 1) +":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            while (hasid(list, id)){ // se o id que ele digitar ja estiver na lista ele manda colocar outro
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employee emp = new employee(id,name,salary); // instancioou os itens na lista com o construtor
            list.add(emp); // adicionou os itens na lista
        }
        System.out.println("Enter the employee ID that will have salary increase : ");
        int idSalary = sc.nextInt();

        employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        // buscando na lista a primeira ocorrencia de um funcionario que tenha o mesmo id

        if (emp == null){
            System.out.println("This id does not exist ! "); // se o id nao existir a funcao acima retorna nulo

        }else   {
            System.out.println("Enter the porcentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        for (employee e : list){
            System.out.println(e);
        }
    }
    public static boolean hasid(List<employee> list, int id){ // comando para acessar os id
        employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    } //
}