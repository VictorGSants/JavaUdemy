package Application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("Enter full file path:");
        String path = sc.next();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line!=null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = (o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase());

            System.out.println("Enter Salary: ");
            Double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary) // pegou os salarios que sao maiores do que a variavel
                    .map(employee -> employee.getEmail()) // pegou os emails desse salario
                    .sorted() // organizou eles em ordem alfabetica
                    .collect(Collectors.toList()); // colocou em uma lista

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M') // pegou todos os nomes que comecam com m
                    .map(x -> x.getSalary()) // pegou os salarios desses nomes
                    .reduce(0.0, (aDouble, aDouble2) -> aDouble + aDouble2); // somou eles

            System.out.println("Sum of salary of people whose name starts with 'M':" + sum);






        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }


        sc.close();
    }
}