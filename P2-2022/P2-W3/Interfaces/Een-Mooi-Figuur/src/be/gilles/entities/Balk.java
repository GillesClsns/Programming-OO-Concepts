package be.gilles.entities;

import be.gilles.controller.Figuur;
import be.gilles.interfaces.HeeftVolume;

public class Balk extends Figuur implements HeeftVolume {

    private Rechthoek basisvlak;
    private double hoogte;

    public Balk(String naam, Rechthoek basisvlak, double hoogte) {
        super(naam);
        this.basisvlak = basisvlak;
        this.hoogte = hoogte;
    }

    public double getLengte() {
        return basisvlak.getLengte();
    }

    public double getBreedte() {
        return basisvlak.getBreedte();
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public double volume() {
        return getBreedte() * getHoogte() * getLengte();
    }
}
