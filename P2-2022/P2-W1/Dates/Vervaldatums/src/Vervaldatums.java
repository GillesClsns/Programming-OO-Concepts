import be.gilles.Broden;
import be.gilles.Brood;

import java.time.LocalDate;
import java.util.Random;

public class Vervaldatums {

    public static void main(String[] args) {

        Broden broden = new Broden();

        for (int i = 0; i <= 30; i++) {
            broden.voegBroodToe(Brood.Soort.GROF, LocalDate.now().plusDays(2).plusDays(new Random().nextInt(3)));

        }

        System.out.println("Inventaris:");
        broden.printBroden();
        System.out.println("Vervallen broden:");
        broden.printVervallenBroden(LocalDate.now().plusDays(2));

    }

}
