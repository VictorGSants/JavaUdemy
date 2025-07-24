import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Instant d01 = Instant.now();
        System.out.println(d01);
        LocalDate d02 = LocalDate.now();
        System.out.println(d02);
        LocalDate d03 = LocalDate.parse("2025-08-25");
        System.out.println(d03);
        LocalDateTime d05 = LocalDateTime.parse("2025-08-25T12:00");

// Textp customizado:

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(fm1.format(d03));

        // Instant para time zone:

        Instant d04 = Instant.parse("2025-06-13T01:30:26Z");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fm2.format(d04));

        // adicionando tempo
        LocalDate lastWeekLocaladate = d03.minusDays(7);
        System.out.println(lastWeekLocaladate);
        LocalDate nextWeekLocaldate = d03.plusDays(7);
        System.out.println(nextWeekLocaldate);

        // duração

        Duration t1 = Duration.between(lastWeekLocaladate.atStartOfDay(), d03.atStartOfDay());
        System.out.println(t1.toDays());
    }
}