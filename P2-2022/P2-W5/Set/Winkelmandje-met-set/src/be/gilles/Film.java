package be.gilles;

import java.util.ArrayList;
import java.util.List;

public class Film extends Artikel {

    private final String titel;
    private final List<String> acteurs;

    public Film(String id, double prijs, String titel, String acteur) {
        super(id, prijs);
        this.titel = titel;
        acteurs = new ArrayList<>();
        acteurs.add(acteur);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void voegActeurToe(String acteur) {
        acteurs.add(acteur);
    }

    @Override
    public String toString() {
        return String.format("%-8s %-40s", getId(), String.format("\"" + getTitel() + "\"" + " (%s)", getActeurs()));
    }

}
