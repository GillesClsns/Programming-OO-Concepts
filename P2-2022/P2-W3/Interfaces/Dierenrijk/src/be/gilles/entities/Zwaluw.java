package be.gilles.entities;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Zwaluw extends Dier implements Eierleggend, Vliegend {

    private final int aantalEierenPerJaar;
    private final double maxVliegsnelheid;

    public Zwaluw(String naam, int eieren, double snelheid) {
        super(naam);
        this.aantalEierenPerJaar = eieren;
        this.maxVliegsnelheid = snelheid;
    }

    @Override
    public String getNaam() {
        return super.getNaam();
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public double getMaxVliegsnelheid() {
        return maxVliegsnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                        Naam: %s
                        Eieren: %d
                        Snelheid: %.0f%n km/h""",
                getNaam(), getAantalEierenPerJaar(), getMaxVliegsnelheid());
    }

}
