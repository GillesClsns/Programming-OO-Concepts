import java.util.Scanner;

public class BMI {

    /**
     * Met zo weinig beweging en na de zoveelste pizza op het werk vraag je je als programmeur soms af of je nog gezond bezig bent.  Maar natuurlijk kom je daarbij niet uit je comfortabele gaming-stoel!  Gewoon af en toe je BMI berekenen kan handig zijn om een indicatie te hebben of je een nieuwe gaming-stoel nodig hebt.
     * Maak een programma dat de lengte en het gewicht vraagt en de BMI berekent (zoek zelf even op internet op hoe dat in zijn werk gaat).
     */
    public static void main(String[] args) {

        final double weight;
        final double length;
        final double bmi;

        Scanner sc = new Scanner(System.in);

        System.out.println("Beste patient, dit programma berekent je BMI.");

        System.out.print("Geef je gewicht in kilogram: ");
        weight = sc.nextDouble();
        System.out.print("Geef je lengte in meters: ");
        length = sc.nextDouble();

        bmi = weight / Math.pow(length, 2);
        System.out.printf("Je BMI is: %.2f", bmi);

    }

}
