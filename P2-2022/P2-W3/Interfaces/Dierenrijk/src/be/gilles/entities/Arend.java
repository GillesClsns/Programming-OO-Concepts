package be.gilles.entities;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Arend extends Dier implements Eierleggend, Vliegend {

    private final int aantalEierenPerJaar;
    private final double maxVliegsnelheid;
    private final double duikSnelheid;

    public Arend(String naam, int eieren, double snelheid, double duikSnelheid) {
        super(naam);
        this.aantalEierenPerJaar = eieren;
        this.maxVliegsnelheid = snelheid;
        this.duikSnelheid = duikSnelheid;
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

    public double getDuikSnelheid() {
        return duikSnelheid;
    }

    @Override
    public String toString() {
        return String.format("""
                        Naam: %s
                        Eieren: %d
                        Snelheid: %.0f
                        Duiksnelheid: %.0f%n""",
                getNaam(), getAantalEierenPerJaar(), getMaxVliegsnelheid(), getDuikSnelheid());
    }

}
