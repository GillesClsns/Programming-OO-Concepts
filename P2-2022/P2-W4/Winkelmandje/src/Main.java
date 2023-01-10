import be.gilles.ArtikelLijn;
import be.gilles.Boek;
import be.gilles.Film;
import be.gilles.Winkelmandje;

public class Main {

    public static void main(String[] args) {

        Boek boek = new Boek("B1011", 32.49, "Titel", "auteur1");
        boek.voegAuteurToe("auteur2");
        Film film = new Film("F0125", 15.95, "Filmtitel", "acteur1");
        film.voegActeurToe("acteur2");
        film.voegActeurToe("acteur3");
        Winkelmandje winkelmandje = new Winkelmandje();
        ArtikelLijn boekArtikelLijn = new ArtikelLijn(boek, 1);
        winkelmandje.voegArtikelToe(boekArtikelLijn);
        boekArtikelLijn.verhoogAantal();
        ArtikelLijn filmArtikelLijn = new ArtikelLijn(film, 1);
        winkelmandje.voegArtikelToe(filmArtikelLijn);
        System.out.println("winkelmandje:\n" + winkelmandje);
        System.out.println("TOTAAL: " + winkelmandje.getPrijs());
        winkelmandje.verwijderArtikel(boekArtikelLijn);
        System.out.println("\nwinkelmandje na verwijderen:\n" + winkelmandje);
        System.out.println("TOTAAL: " + winkelmandje.getPrijs());
    }
}
