import be.gilles.Leden;
import be.gilles.Lid;

import static be.gilles.Lid.Soort.*;

public class Voetbalclub {

    public static void main(String[] args) {

        Leden leden = new Leden();

        leden.voegLidToe(new Lid(1001, "Luka", GEWOON));
        leden.voegLidToe(new Lid(1002, "Gevorg", ERELID));
        leden.voegLidToe(new Lid(1003, "Lorenzo", STEUNEND));
        leden.voegLidToe(new Lid(1004, "Pavel", GEWOON));
        leden.voegLidToe(new Lid(1005, "Sarah", GEWOON));
        leden.voegLidToe(new Lid(1006, "Noam", ERELID));

        System.out.printf("Aantal actieve leden: %d%n", leden.getAantalActieveLeden());
        leden.printActieveLeden();

        System.out.printf("Aantal leden: %d%n%s",
                leden.getAantal(), leden.getLid(0));

    }
}
