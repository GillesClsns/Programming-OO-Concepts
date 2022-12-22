import java.util.Scanner;

public class Tafels {

    /**
     * Laatst stond mijn kleine zus naast mij (te staren naar mijn gaming skills) en plots vraagt die: hoeveel is 7 maal 8?  Tja, die tafels van vermenigvuldiging.  Weet ik veel.  Maar wacht!  Ik ben een programmeur!  Dus kan ik dat snel even programmeren.
     * Schrijf een programma dat de tafels van vermenigvuldiging van de getallen tot 10 kan afdrukken.
     * <p>
     * Uitbreiding:
     * Maak er een oefening voor kinderen van: ze moeten telkens het antwoord geven (0 x 7 = ...) en als het correct is, komt de volgende vraag.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int errors = 0;

        System.out.print("Welke tafel wil je oefenen? ");
        final int table = sc.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.printf("%d x %d = ", i, table);

            if (sc.nextInt() == (i * table)) {
                System.out.println("Correct!");

            } else {
                System.out.println("Fout!");
                i--; errors++;

            }

        }

        System.out.printf("Je maakte %d fouten op de tafel van %d.", errors, table);

    }

}
