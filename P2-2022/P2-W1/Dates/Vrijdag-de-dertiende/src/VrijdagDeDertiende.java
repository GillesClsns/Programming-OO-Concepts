import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VrijdagDeDertiende {

    /**
     * Vrijdag de dertiende...  altijd een beetje opletten die dag, want je weet maar nooit :-)
     * Maak een programma dat alle dagen tussen 1 januari 2020 en 31 december 2029 afdrukt waarop de dertiende van de maand op een vrijdag valt.
     */
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        for (LocalDate date = LocalDate.of(2020, 1, 1);
             date.isBefore(LocalDate.of(2029, 12, 31));
             date = date.plusDays(1))

            if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) System.out.println(formatter.format(date));
    }

}
