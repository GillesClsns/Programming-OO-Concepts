import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bioritme {

    /**
     * Volgens de theorie van de bioritmiek is de menselijke levenscyclus verdeelbaar in drie cycli van verschillende lengte:
     *     • de fysieke cyclus van 23 dagen
     *     • de emotionele cyclus van 28 dagen
     *     • de intellectuele cyclus van 33 dagen
     * Deze cycli worden weergegeven als sinussen die om de zoveel dagen herhalen.  Iedere keer wanneer de lijn door de middellijn gaat, spreken we van een “kritieke dag”.  Zo kan je op voorhand bepalen of je fysiek, emotioneel of intellectueel in vorm zal zijn.
     * Om de bioritmes te bepalen, moet je dus weten hoeveel dagen oud iemand is.
     * <p>
     * Maak een programma dat de geboortedatum vraagt en bepaalt hoeveel dagen oud de gebruiker is.
     */
    public static void main(String[] args) {

        final int day;
        final int month;
        final int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Geef je geboortedag: "); day = sc.nextInt();
        System.out.print("Geef je geboortemaand: "); month = sc.nextInt();
        System.out.print("Geef je geboortejaar: "); year = sc.nextInt();

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
