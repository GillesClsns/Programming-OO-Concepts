import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {

    /**
     * Verjaardagen en leeftijden onthouden: het is niet iedereen gegeven en je partner kan het je heel kwalijk nemen als je dit weer vergeten bent.  Gelukkig ben je een programmeur en is er een oplossing voor dit toch wel belangrijke probleem.
     * Maak een programma dat een naam en geboortejaar vraagt en dan de leeftijd berekent.
     */
    public static void main(String[] args) {

        final String username;
        final int birthYear;

        Scanner sc = new Scanner(System.in);

        System.out.print("Wat is je naam: ");
        username = sc.nextLine();

        System.out.printf("Beste %s, geef je geboortejaar: ", username);
        birthYear = sc.nextInt();

        System.out.println("Alles alles goed loopt word je dit jaar " + (LocalDate.now().getYear() - birthYear));

    }

}
