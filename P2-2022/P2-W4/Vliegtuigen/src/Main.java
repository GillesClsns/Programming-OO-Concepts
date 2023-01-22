import be.gilles.Vliegtuig;
import be.gilles.VliegtuigType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Vliegtuig v1 = new Vliegtuig(new VliegtuigType("A345", "Airbus A340-541"), "A6-EHD", "Etihad Airways");
        Vliegtuig v2 = new Vliegtuig(new VliegtuigType("B739", "Boeing 737-9K2"), "PH-BXR", "KLM");
        Vliegtuig v3 = new Vliegtuig(new VliegtuigType("B748", "Boeing 747-830"), "D-ABYQ", "Lufthansa");
        Vliegtuig v4 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-323X"), "N820NW", "Delta Air Lines");
        Vliegtuig v5 = new Vliegtuig(new VliegtuigType("A333", "Airbus A330-343X"), "C-GFAJ", "Air Canada");

        List<Vliegtuig> vliegtuigen = new ArrayList<>();
        vliegtuigen.add(v1);
        vliegtuigen.add(v2);
        vliegtuigen.add(v3);
        vliegtuigen.add(v4);
        vliegtuigen.add(v5);

        vliegtuigen.forEach(System.out::println);

        /*while (vliegtuigIterator.hasNext()) { // The less-efficient iterator way :3
            Vliegtuig vliegtuig = vliegtuigIterator.next();
            if (vliegtuig.maatschappij().equals("KLM")) vliegtuigIterator.remove();
        }*/

        vliegtuigen.removeIf(vliegtuig -> vliegtuig.maatschappij().equals("KLM"));

        vliegtuigen.forEach(System.out::println);
    }

}
