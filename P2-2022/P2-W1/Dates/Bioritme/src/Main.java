import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int day = sc.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int month = sc.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int year = sc.nextInt();

        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        long daysOld = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        System.out.printf("\nJe bent vandaag %d dagen oud.\n", daysOld);

        double fysiek = Math.abs(Math.sin(daysOld / 23.0 * 2 * Math.PI));
        double emotioneel = Math.abs(Math.sin(daysOld / 28.0 * 2 * Math.PI));
        double intellectueel = Math.abs(Math.sin(daysOld / 33.0 * 2 * Math.PI));

        System.out.printf("""
                Je bioritmes zijn:
                - Fysiek: %s
                - Emotioneel: %s
                - Intellectueel: %s""",
                getCondition(fysiek), getCondition(emotioneel), getCondition(intellectueel));

    }

    public static String getCondition(double type) {
        return type > 0.8
                ? "topcondtie" : type > 0.5
                ? "goed" : type > 0.2
                ? "ok" : "kritieke waarde";
    }

}