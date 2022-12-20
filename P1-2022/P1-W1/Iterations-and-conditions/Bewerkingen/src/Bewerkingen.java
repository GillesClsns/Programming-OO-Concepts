import java.util.Scanner;

public class Bewerkingen {

    /**
     * Als je als programmeur je rekenmachine laat vallen, ga je natuurlijk niet opstaan om die op te rapen: dat kost teveel energie.  Je hebt dat ding namelijk niet nodig want je kan een rekenmachine gewoon zelf programmeren.
     * Schrijf een programma dat een getal vraagt en daarna nog een getal. Vervolgens wordt een menu getoond met verschillende rekenkundige bewerkingen. Als de gebruiker een keuze heeft gemaakt, toon je het resultaat.
     */
    public static void main(String[] args) {

        final int[] val = new int[2];
        final int solution;
        final char operator;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.print("Geef een getal: ");
            val[i] = sc.nextInt();

        }

        System.out.print("""
                Kies een bewerking:
                1. Optellen
                2. Aftrekken
                3. Vermenigvuldigen
                4. Delen
                Jouw keuze:\s""");

        switch (sc.nextInt()) {

            case 1 -> {
                solution = val[0] + val[1];
                operator = '+';
            }
            case 2 -> {
                solution = val[0] - val[1];
                operator = '-';
            }
            case 3 -> {
                solution = val[0] * val[1];
                operator = '*';
            }
            case 4 -> {
                solution = val[0] / val[1];
                operator = '/';
            }
            default -> throw new IllegalStateException("Unexpected value: " + sc.nextInt());

        }

        System.out.printf("%d %c %d = %d", val[0], operator, val[1], solution);

    }

}
