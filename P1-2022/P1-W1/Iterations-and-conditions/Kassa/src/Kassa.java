import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Kassa {

    /**
     * Oudere programmeurs hebben dikwijls kinderen en die moeten af en toe eens geanimeerd worden.  Dus gaan ze naar een pretpark.
     * Aan de kassa van het pretpark gelden volgende tarieven:
     * <p>
     *     • kinderen kleiner dan 1m mogen gratis binnen
     *     • kinderen van 1m tot 1,40 m betalen 26 EUR
     *     • volwassenen en kinderen groter dan 1,40 m betalen 31 EUR
     *     • senioren (55+) betalen 15,50 EUR
     * <p>
     * Verder zijn er nog situaties waarin er korting wordt toegekend:
     * <p>
     *     • voor groepen vanaf 10 betalende personen wordt een korting van 10% toegekend
     *     • als opa en oma (twee senioren) hun kleinkinderen meenemen, dan mogen de kinderen tegen halve prijs.  Deze korting is enkel geldig als er geen groepskorting is.  Het systeem geeft altijd het meest voordelige tarief.
     * <p>
     * Maak een programma dat je kan gebruiken om te verifiëren dat het pretpark je de juiste prijs aanrekent.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Aantal kinderen <1m: ");
        final int babies = sc.nextInt();
        System.out.print("Aantal kinderen tussen 1m en 1,40m: ");
        final int children = sc.nextInt();
        System.out.print("Aantal volwassenen: ");
        final int adults = sc.nextInt();
        System.out.print("Aantal senioren (55+): ");
        final int seniors = sc.nextInt();

        System.out.printf("""
                *******************************
                * Welkom in het pretpark! *
                *******************************
                * Prijs: %.2f EUR
                * Grootouderkorting: %.2f EUR
                * Totaal: %.2f EUR
                **************************************""");



    }

}
