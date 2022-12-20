import java.util.Scanner;

public class Bmi {

    /**
     * Het programma van vorige keer om de BMI te berekenen was al vrij goed, maar dan moet je iedere keer weer opzoeken wat die waarde betekent.  Maar geen nood: een programmeur kan dit handig oplossen met een simpele aanpassing.
     * Breid het vorige BMI programma uit zodat er ook een melding komt die zegt of de BMI OK is.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double weight;
        final double length;
        final double bmi;

        System.out.println("Beste patiënt, dit programma berekent je BMI.");

        System.out.print("Geef je gewicht in kilogram: ");
        weight = sc.nextDouble();
        System.out.print("Geef  je lengte in meters: ");
        length = sc.nextDouble();

        bmi = weight / Math.pow(length, 2);
        System.out.println("Je BMI is: " + Math.round(bmi * 100.0) / 100.0);

        System.out.printf("Dat is %s.", bmi > 30 ? "obesitas"
                        : bmi > 25 ? "overgewicht"
                        : bmi > 18 ? "in orde"
                        : "ondergewicht");

    }

}
