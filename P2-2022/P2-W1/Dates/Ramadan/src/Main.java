import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dit programma schat dat de Ramadan op volgende datums zal starten:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (LocalDate date = LocalDate.of(2022, 4, 2);
             date.isBefore(LocalDate.of(2026, 1, 1));
             date = date.plusDays(354))
            System.out.println(formatter.format(date));

    }

}