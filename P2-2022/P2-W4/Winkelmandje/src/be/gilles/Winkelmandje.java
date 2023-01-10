package be.gilles;

import java.util.LinkedList;
import java.util.List;

public class Winkelmandje {

    private final List<ArtikelLijn> artikelLijnen;

    public Winkelmandje() {
        this.artikelLijnen = new LinkedList<>();
    }

    public void voegArtikelToe(ArtikelLijn artikel) {
        artikelLijnen.add(artikel);
    }

    public void verwijderArtikel(ArtikelLijn artikel) {
        artikelLijnen.remove(artikel);
    }

    public double getPrijs() {
        double sum = 0;
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            sum += artikelLijn.getPrijs();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Winkelmandje{" +
                "artikelLijnen=" + artikelLijnen +
                '}';
    }
}
