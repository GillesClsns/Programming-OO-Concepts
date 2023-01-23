package be.gilles;

import java.util.Map;
import java.util.TreeMap;

public class Piloten {

    private final Map<String, Piloot> piloten;

    public Piloten() {
        this.piloten = new TreeMap<>();
        fillMap();
    }

    public void fillMap() {

        Piloot[] kampioenen = {
                new Piloot("Duits", "Michael Schumacher", 7),
                new Piloot("Argentijns", "Juan Manuel Fangio", 5),
                new Piloot("Frans", "Alain Prost", 4),
                new Piloot("Duits", "Sebastian Vettel", 4),
                new Piloot("Australisch", "Jack Brabham", 3),
                new Piloot("Brits", "Jackie Stewart", 3),
                new Piloot("Oostenrijks", "Niki Lauda", 3),
                new Piloot("Braziliaans", "Nelson Piquet", 3),
                new Piloot("Braziliaans", "Ayrton Senna", 3)
        };

        int[][] seizoenen = {
                {1994, 1995, 2000, 2001, 2002, 2003, 2004},
                {1951, 1954, 1955, 1956, 1957},
                {1985, 1986, 1989, 1993},
                {2010, 2011, 2012, 2013},
                {1959, 1960, 1966},
                {1969, 1971, 1973},
                {1975, 1977, 1984},
                {1981, 1983, 1987},
                {1988, 1990, 1991}
        };

        for (int i = 0; i < seizoenen.length; i++) {
            for (int x : seizoenen[i])
                kampioenen[i].voegSeizoenToe(x);
        }

        for (Piloot x : kampioenen)
            piloten.put(x.getNaam(), x);

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Piloot piloot : piloten.values().stream().sorted(new PilotenComparator()).toList())
            sb.append(String.format("%-16s%-21s%-3d%s%n",
                    piloot.getNationaliteit(), piloot.getNaam(), piloot.getAantalTitels(), piloot.getSeizoenen()));

        return sb.toString();
    }
}
