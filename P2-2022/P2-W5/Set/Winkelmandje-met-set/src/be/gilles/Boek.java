package be.gilles;

import java.util.ArrayList;
import java.util.List;

public class Boek extends Artikel {

    private final String titel;
    private final List<String> auteurs;

    public Boek(String id, double prijs, String titel, String auteur) {
        super(id, prijs);
        this.titel = titel;
        auteurs = new ArrayList<>();
        auteurs.add(auteur);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getAuteurs() {
        return auteurs;
    }

    public void voegAuteurToe(String auteur) {
        auteurs.add(auteur);
    }

    @Override
    public String toString() {
        return String.format("%-8s %-40s", getId(), String.format("\"" + getTitel() + "\"" + " (%s)", getAuteurs()));
    }

}
