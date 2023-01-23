package be.gilles;

import java.util.*;

public class Winkelmandje {

    private final Set<ArtikelLijn> artikelLijnen;

    public Winkelmandje() {
        this.artikelLijnen = new HashSet<>();
    }

    public void voegArtikelToe(ArtikelLijn artikelLijn) {
        artikelLijnen.add(artikelLijn);
    }

    public void verwijderArtikel(ArtikelLijn artikelLijn) {
        artikelLijnen.remove(artikelLijn);
    }

    public double getPrijs() {

        double sum = 0;
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            sum += artikelLijn.getPrijs();
        }
        return sum;
    }

    public List<ArtikelLijn> artikelenVolgensId() {
        return artikelLijnen.stream().sorted(Comparator.comparing(o -> o.getArtikel().getId())).toList();
    }

    public List<ArtikelLijn> artikelenVolgensNaam() {
        return artikelLijnen.stream().sorted(Comparator.comparing(o -> o.getArtikel().getTitel())).toList();
    }

    public List<ArtikelLijn> artikelenVolgensPrijs() {
        return artikelLijnen.stream().sorted(Comparator.comparing(o -> o.getArtikel().getPrijs())).toList();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (ArtikelLijn artikelLijn : artikelLijnen) {
            stringBuilder.append(artikelLijn);
        }

        return stringBuilder.toString();
    }

}