import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        for (LocalDate date = LocalDate.of(2020, 1, 1);
             date.isBefore(LocalDate.of(2029, 12, 31));
             date = date.plusDays(1))

            if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) System.out.println(formatter.format(date));

    }

}