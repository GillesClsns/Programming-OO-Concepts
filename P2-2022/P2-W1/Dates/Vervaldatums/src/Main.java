import be.gilles.Broden;
import be.gilles.Brood;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Broden broden = new Broden();
        final String ANSI_RED = "\u001B[31m";

        for (int i = 0; i < 100; i++) {

            broden.voegBroodToe(Brood.randomSoort(), LocalDate.now().plusDays(new Random().nextInt(2, 5)));

        }

        broden.printBroden();

        System.out.println(ANSI_RED + "Broden die overmorgen vervallen: ");
        broden.printBrodenByDate(LocalDate.now().plusDays(2));

    }

}