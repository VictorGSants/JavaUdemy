package Model.entities;


import Model.exceptions.DomainExeptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // static: pois é apenas um, NUNCA MUDA

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExeptions {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

        if(!checkOut.after(checkIn)) {  // .after testa se uma data é depois da outra
            throw new DomainExeptions("Check-Out date must be after check-in date");
        }

    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); // .getTime() devolve a quantidade de milisegundos da data
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // timeunit converte o diff de milisegundos para dias
    }
    public void UpadteDates(Date checkIn, Date checkOut) throws DomainExeptions{ // passa pra frente pois o metodo responsavel por tratar a exceção esta no programa principal
        Date now = new Date(); // data atual
        if (checkIn.before(now) || checkOut.before(now)) {  // .before testa para ver se a nova data é futura
           throw new DomainExeptions("Reservation dates for updates must be future dates");
        }
        if(!checkOut.after(checkIn)) {  // .after testa se uma data é depois da outra
           throw new DomainExeptions("Check-Out date must be after check-in date");
        }
        this.checkIn = checkIn; /* This.CheckIN para se referir ao metodo principal (private Date checkIn;) e para receber o valor que esta no argumento.*/
        this.checkOut = checkOut;
    }
    @Override
    public String toString(){
        return "Room " + roomNumber + ", check-In: " + sdf.format(checkIn) + ", check-Out: " + sdf.format(checkOut) + ", " + duration() + " nights";
     }

}
