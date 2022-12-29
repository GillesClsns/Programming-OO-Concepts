import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        DayOfWeek d = LocalDate.of(1918, 11, 11).getDayOfWeek();
        System.out.println("Wapenstilstand (11 november 1918) viel op een " + d.toString().toLowerCase());


        System.out.println("\nIn deze jaren valt wapenstilstand op een zondag:");
        for (int i = 1980; i <= 2040; i++) {
            DayOfWeek d2 = LocalDate.of(i, 11, 11).getDayOfWeek();
            System.out.print(d2 == DayOfWeek.SUNDAY ? i + " " : "");

        }

    }

}