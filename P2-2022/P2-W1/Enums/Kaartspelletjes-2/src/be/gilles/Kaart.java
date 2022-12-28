package be.gilles;

import be.gilles.enums.Kaartkleur;
import be.gilles.enums.Kaartwaarde;

import java.util.Random;

public class Kaart {

    private final Kaartkleur kaartkleur;
    private final Kaartwaarde kaartwaarde;
    private final Random random;

    public Kaart(Kaartkleur kaartkleur, Kaartwaarde kaartwaarde) {

        this.random = new Random();
        this.kaartkleur = kaartkleur;
        this.kaartwaarde = kaartwaarde;

    }

    public Kaart() {

        this.random = new Random();
        this.kaartkleur = Kaartkleur.values()[random.nextInt(Kaartkleur.values().length)];
        this.kaartwaarde = Kaartwaarde.values()[random.nextInt(Kaartwaarde.values().length)];

    }

    public Kaartwaarde getKaartwaarde() {
        return kaartwaarde;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", kaartkleur, kaartwaarde.getValue());
    }

}
