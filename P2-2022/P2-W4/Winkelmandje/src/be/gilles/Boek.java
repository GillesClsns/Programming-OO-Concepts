package be.gilles;

import java.util.ArrayList;
import java.util.List;

public class Boek extends Artikel {

    private final String titel;
    private final List<String> auteurs;

    public Boek(String id, double prijs, String titel, String auteur) {
        super(id, prijs);
        this.titel = titel;
        this.auteurs = new ArrayList<>();
        this.auteurs.add(auteur);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getAuteurs() {
        return auteurs;
    }

    public void voegAuteurToe(String auteur) {
        this.auteurs.add(auteur);
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" (%s)", getId(), getTitel(), getAuteurs());
    }
}
