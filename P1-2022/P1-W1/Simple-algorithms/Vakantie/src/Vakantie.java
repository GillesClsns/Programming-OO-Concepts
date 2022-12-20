import java.util.Scanner;

public class Vakantie {

    /**
     * Yousra en Quinten gaan samen op reis.  Ze willen daarbij de kosten delen.  Iedereen schrijft dus op wat hij heeft uitgegeven.  Maar dan komt het probleem: nu moeten die kosten verdeeld worden en uitgerekend worden wie er aan wie moet betalen.  Gelukkig zijn dit niet een aantal willekeurige vrienden: het zijn programmeurs!  Een oplossing is dus zo geprogrammeerd.
     * Schrijf een programma dat aan iedereen vraagt hoeveel ze hebben uitgegeven op vakantie.  Daarna berekent het programma hoeveel geld iedereen aan iedereen moet betalen.
     */
    public static void main(String[] args) {

        final double yousraExpenses;
        final double quintenExpenses;
        final double total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hoeveel heeft Yousra uitgegeven? ");
        yousraExpenses = sc.nextDouble();
        System.out.print("Hoeveel heeft Quinten uitgegeven? ");
        quintenExpenses = sc.nextDouble();

        total = yousraExpenses + quintenExpenses;

        System.out.printf(
                """
                        In totaal werd er %.2f EUR uitgegeven.
                        Dat is %.2f EUR per persoon.
                        %s moet dus %.2f EUR betalen aan %s
                        """,
                total, total / 2,
                yousraExpenses > quintenExpenses ? "Quinten" : "Yousra",
                (total / 2) - Math.min(yousraExpenses, quintenExpenses),
                quintenExpenses > yousraExpenses ? "Quinten" : "Yousra");

    }

}
