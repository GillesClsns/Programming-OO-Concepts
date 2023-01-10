package be.gilles;

import java.util.ArrayList;
import java.util.List;

public class Film extends Artikel {

    private final String titel;
    private List<String> acteurs;


    public Film(String id, double prijs, String titel, String acteur) {
        super(id, prijs);
        this.titel = titel;
        this.acteurs = new ArrayList<>();
        this.acteurs.add(acteur);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void voegActeurToe(String acteur) {
        this.acteurs.add(acteur);
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" (%s)", getId(), getTitel(), getActeurs());
    }

}
