package be.gilles.entities;

import be.gilles.controller.Figuur;
import be.gilles.interfaces.HeeftVolume;

public class Bol extends Figuur implements HeeftVolume {

    private final double straal;

    public Bol(String naam, double straal) {
        super(naam);
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double volume() {
        return (4F / 3F) * (Math.PI * (Math.pow(getStraal(), 3)));
    }
}
