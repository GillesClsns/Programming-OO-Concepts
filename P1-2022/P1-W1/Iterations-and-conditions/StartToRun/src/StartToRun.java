import java.util.Scanner;

public class StartToRun {

    /**
     * Niet-programmeurs hebben soms hele rare hobbies.  Zoals lopen bijvoorbeeld (ik word al moe als ik eraan denk).  En die mensen weten dan graag hoe ze ideaal kunnen trainen.  De programmeur is natuurlijk bereid om daar een schitterend programma voor te schrijven!
     * Schrijf een programma dat assisteert bij een looptraining. De gebruiker geeft zijn leeftijd, hartslag in rust en het soort training dat hij wil doen. Aan de hand van die gegevens wordt de maximale en de ideale hartslag berekend.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int age;
        final int hrRest;
        final int hrMax;

        System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");

        System.out.print("Geef je leeftijd: ");
        age = sc.nextInt();
        hrMax = 220 - age;

        System.out.print("Geef je hartslag in rust: ");
        hrRest = sc.nextInt();

        System.out.print("""
                Welk soort training wil je doen?
                1 : recuperatie training
                2 : LSD training (Long Slow Distance)
                3 : extensieve uithouding
                4 : intensieve uithouding
                5 : tempo-interval
                6 : intensieve interval
                Jouw keuze:\s""");

        double hrIdeaal = switch (sc.nextInt()) {
            case 1 -> hrMax * 0.65;
            case 2 -> hrMax * 0.70;
            case 3 -> hrMax * 0.75;
            case 4 -> hrMax * 0.85;
            case 5 -> hrMax * 0.90;
            case 6 -> hrMax * 0.95;
            default -> throw new IllegalStateException("Unexpected value.");
        };

        System.out.printf("""
                Je maximale hartslag is %d.
                Je traint best met een hartslag rond de %.0f.""", hrMax, hrIdeaal);
    }

}
