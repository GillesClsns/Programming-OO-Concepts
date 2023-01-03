package be.gilles.entities;

import be.gilles.controller.Figuur;
import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.interfaces.HeeftOppervlakte;
import be.gilles.interfaces.HeeftVolume;

public class Cirkel extends Figuur implements HeeftOmtrek, HeeftOppervlakte {

    private final double straal;

    public Cirkel(String naam, double straal) {
        super(naam);
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double omtrek() {
        return Math.PI * (straal * 2);
    }

    @Override
    public double oppervlakte() {
        return straal * straal * Math.PI;
    }
}
