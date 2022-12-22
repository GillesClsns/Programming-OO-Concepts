import java.util.Scanner;

public class Reeksen {

    /**
     * Laatst kwam een vriend (ja ik heb er een paar) langs die een tekening wou maken.  Hij moest om de x aantal centimeter een streepje zetten.  Hij vroeg zich af of ik een programma kon maken dat hem vertelde waar die streepjes moesten komen.  Tuurlijk, geen probleem!
     * Schrijf een programma dat drie getallen vraagt aan de gebruiker: “aantal”, “start” en “stapgrootte”.  Vervolgens drukt dit programma het gevraagde aantal getallen af vanaf start met de gegeven stapgrootte.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int amount;
        final int start;
        final int step;

        System.out.print("Hoeveel getallen wil je afdrukken? ");
        amount = sc.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        start = sc.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        step = sc.nextInt();

        for (int i = 0, j = step; i < amount; i++) {
            System.out.printf("%d ", j += step);
        }

    }

}
