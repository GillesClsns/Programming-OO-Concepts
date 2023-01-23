import be.gilles.ArtikelLijn;
import be.gilles.Boek;
import be.gilles.Film;
import be.gilles.Winkelmandje;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Boek boek = new Boek("B1011", 32.49, "Titel", "auteur1");
        boek.voegAuteurToe("auteur2");
        Film film = new Film("F0125", 15.95, "Filmtitel", "acteur1");
        film.voegActeurToe("acteur2");
        film.voegActeurToe("acteur3");
        Winkelmandje winkelmandje = new Winkelmandje();
        ArtikelLijn artikelLijn1 = new ArtikelLijn(boek, 1);
        winkelmandje.voegArtikelToe(artikelLijn1);
        artikelLijn1.verhoogAantal();
        winkelmandje.voegArtikelToe(new ArtikelLijn(film, 1));
        System.out.println("winkelmandje volgens id:");
        System.out.printf("%-8s%-45s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensId()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs());
        System.out.println("winkelmandje volgens naam:");
        System.out.printf("%-8s%-45s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensNaam()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs());
        System.out.println("winkelmandje volgens prijs:");
        System.out.printf("%-8s%-45s%-8s%-6s\n", "nummer", "beschrijving", "aantal", "totaal");
        for (ArtikelLijn artikelLijn : winkelmandje.artikelenVolgensPrijs()) {
            System.out.println(artikelLijn);
        }
        System.out.println("TOTAAL: " + winkelmandje.getPrijs());

    }

}