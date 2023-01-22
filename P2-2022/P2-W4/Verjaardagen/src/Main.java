import be.gilles.Datum;
import be.gilles.Maand;
import be.gilles.Persoon;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Persoon[] data = {
                new Persoon("Jeremy", new Datum(16, Maand.MEI)),
                new Persoon("Bo", 9, Maand.DECEMBER),
                new Persoon("Evelyne", 15, Maand.AUGUSTUS),
                new Persoon("Jeremy", 23, Maand.AUGUSTUS),
                new Persoon("Divine", new Datum(25, Maand.APRIL)),
                new Persoon("Ayoub", 15, Maand.AUGUSTUS),
                new Persoon("Jeremy", 3, Maand.AUGUSTUS),
                new Persoon("Divine", 10, Maand.APRIL)
        };

        List<Persoon> personen = new ArrayList<>(Arrays.asList(data));
        toonPersonen(personen);

        System.out.println("\nGesorteerd op verjaardag:");
        personen.sort(Comparator.comparing(Persoon::getVerjaardag));
        toonPersonen(personen);

        System.out.println("\nGesorteerd op naam:");
        personen.sort(Comparator.comparing(Persoon::getNaam));
        toonPersonen(personen);
    }

    private static void toonPersonen(List<Persoon> personen) {
        personen.forEach(System.out::println);
    }
}
