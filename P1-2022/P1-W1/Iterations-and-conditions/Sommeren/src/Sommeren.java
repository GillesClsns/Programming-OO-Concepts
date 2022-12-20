import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Sommeren {

    /**
     * Wat als je nu een berekening wil doen met meer getallen?  Ook daar weet een programmeur het antwoord op!
     * Schrijf een programma dat de som kan berekenen van een willekeurig aantal getallen.
     * De gebruiker geeft telkens een getal in en eindigt door 0 in te geven.
     */
    public static void main(String[] args) {

        ArrayList<Integer> val = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Geef een getal (stop met 0): ");
            val.add(sc.nextInt());

        } while (val.get(val.size() - 1) != 0);

        int sum = val.stream().reduce(0, Integer::sum);
        int size = val.size() - 1;

        System.out.printf("""
                De som van deze getallen is: %d
                Het gemiddelde van deze getallen is: %d
                Aantal ingegeven getallen: %d
                Einde programma!""", sum, sum / size, size);

    }

}
