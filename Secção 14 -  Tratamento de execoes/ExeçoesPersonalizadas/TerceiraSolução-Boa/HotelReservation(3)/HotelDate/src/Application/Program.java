package Application;

import Model.entities.Reservation;
import Model.exceptions.DomainExeptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){ //throws ParseException { AGORA A EXEÇÃO VAI SER TRATADA E NAO PROPAGADA

        /*
        Quando você coloca throws ParseException na assinatura do método, você está dizendo:
        "Esse método pode lançar esse erro. Quem usar ele, que trate!"
        Significa que o main pode lançar um erro, e quem quiser usar, precisa saber disso.

        Se você só quer testar e não se preocupa com o erro agora, usar throws ParseException é mais rápido.
        Mas se você quiser que o programa não trave quando der erro, use try-catch e trate o erro com uma mensagem amigável.

        */
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("CheckIn Date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next()); // CHAMADA QUE PODE CAUSAR ERRO

            System.out.print("CheckOut Date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            // Criando Exeções personalizada:
            /*if (!checkOut.after(checkIn)){  // .after testa se uma data é depois da outra
                System.out.println("Error in reservation: Check-Out date must be after check-in date" ); // mensagem de erro
            }else*/

            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Enter data to update the reservation: ");
            // Ler as novas datas:

            System.out.print("CheckIn Date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next()); // CHAMADA QUE PODE CAUSAR ERRO

            System.out.print("CheckOut Date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.UpadteDates(checkIn, checkOut); // metodos responsaveis por atualizar as datas, e buscar os erros
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format ");
        }
        catch (DomainExeptions e){
            System.out.println("Error in reservation " + e.getMessage()); // getMessage é a mensagem que passou na hora de instanciar a exeção (Linha)
        }

        sc.close();

    }
}