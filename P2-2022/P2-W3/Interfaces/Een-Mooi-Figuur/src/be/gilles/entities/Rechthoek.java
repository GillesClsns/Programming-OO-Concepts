package be.gilles.entities;

import be.gilles.controller.Figuur;
import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.interfaces.HeeftOppervlakte;

public class Rechthoek extends Figuur implements HeeftOmtrek, HeeftOppervlakte {

    private final double lengte;
    private final double breedte;

    public Rechthoek(String naam, double lengte, double breedte) {
        super(naam);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    @Override
    public double omtrek() {
        return (lengte * 2) + (breedte * 2);
    }

    @Override
    public double oppervlakte() {
        return lengte * breedte;
    }
}
