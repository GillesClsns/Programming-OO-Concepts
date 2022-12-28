import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class Wapenstilstand {

    /**
     * Maak een programma dat weergeeft op welke dag wapenstilstand (11 november 1918) viel.
     * Vervolgens zet het programma alle jaren in de range 1980..2040 waarin wapenstilstand op een
     * zondag valt in een tabel. Een lengte van 10 voor de tabel volstaat. Het programma drukt daarna de waarden in de tabel op één regel af.
     */
    public static void main(String[] args) {

        DayOfWeek d = LocalDate.of(1918, 11, 11).getDayOfWeek();
        System.out.printf("Wapenstilstand (11 november 1918) viel op een %s.%n", d.toString().toLowerCase());

        System.out.println("In deze jaren valt wapenstilstand op een zondag:");
        IntStream.rangeClosed(1980, 2040)
                .filter(i -> LocalDate.of(i, 11, 11).getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(i -> System.out.print(i + " "));

        /* Regular for loop:
         *
         * for (int i = 1980; i <= 2040; i++) {
         * DayOfWeek d2 = LocalDate.of(i, 11, 11).getDayOfWeek();
         * System.out.print(d2 == DayOfWeek.SUNDAY ? i + " " : "");
         *
         * }
        */
    }

}
