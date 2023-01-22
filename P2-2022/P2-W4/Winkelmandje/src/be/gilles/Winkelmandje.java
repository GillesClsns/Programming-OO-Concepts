package be.gilles;

import java.util.LinkedList;
import java.util.List;

public class Winkelmandje {

    private final LinkedList<ArtikelLijn> artikelLijnen;

    public Winkelmandje() {
        this.artikelLijnen = new LinkedList<>();
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            stringBuilder.append(artikelLijn);
        }

        return stringBuilder.toString();
    }

}