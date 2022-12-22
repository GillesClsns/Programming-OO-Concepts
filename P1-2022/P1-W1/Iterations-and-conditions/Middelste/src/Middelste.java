import java.util.Arrays;
import java.util.Scanner;

public class Middelste {

    /**
     * Als je een keuze moet maken, is het altijd gevaarlijk om iets extreem te kiezen.  Het meest veilige is de “gulden middenweg”.  En als goede programmeur kan je dit zelf berekenen.
     * Schrijf een programma dat van drie verschillende ingelezen getallen (in de range 1..100) het getal met de middelste waarde afdrukt. Met de middelste waarde bedoelen we het tweede getal als je de drie getallen van klein naar groot sorteert. Druk op het einde "Einde programma!" af.
     */
    public static void main(String[] args) {

        final int MAX_NUM = 3;
        final int[] values = new int[MAX_NUM];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < MAX_NUM; i++) {

            System.out.print("Geef een getal (1..100): ");
            values[i] = sc.nextInt();

            if (values[i] > 100 || values[i] < 1) {
                System.out.println("Het getal moet tussen 1 en 100 liggen!");
                i--;
            }

        }

        int middle = Arrays.stream(values)
                .sorted()
                .skip(values.length / 2)
                .findFirst()
                .getAsInt();

        System.out.printf("Het middelste getal is %d.\n", middle);

        System.out.println("Einde programma!");

    }

}
