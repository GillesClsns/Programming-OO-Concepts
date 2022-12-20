import java.util.Scanner;

public class Product {

    /**
     * De tafels van vermenigvuldiging zitten waarschijnlijk nog dagelijks in je hoofd te spoken.  Ze houden je wakker, maken je rusteloos en gestrest. Nochtans kan de computer moeiteloos vermenigvuldigingen uitvoeren.  Als programmeur kan je je dus vrij maken van de nachtmerries die de leerkrachten in het lager onderwijs hebben veroorzaakt.
     * Maak eens een programma dat het product van 3 getallen kan berekenen.
     */
    public static void main(String[] args) {

        int product = 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Geef een getal: ");
            product *= sc.nextInt();

        }

        System.out.println("Het product is: " + product);

    }

}
