package be.gilles.entities;

import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Struisvogel extends Dier implements Eierleggend {

    private final int aantalEierenPerJaar;

    public Struisvogel(String naam, int eieren) {
        super(naam);
        this.aantalEierenPerJaar = eieren;
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
    public String toString() {
        return String.format("""
                        Naam: %s
                        Eieren: %d%n""",
                getNaam(), getAantalEierenPerJaar());
    }

}
