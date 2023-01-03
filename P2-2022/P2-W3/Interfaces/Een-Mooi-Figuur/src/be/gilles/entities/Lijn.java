package be.gilles.entities;

import be.gilles.controller.Figuur;
import be.gilles.interfaces.HeeftOmtrek;

public class Lijn extends Figuur implements HeeftOmtrek {

    private final double lengte;

    public Lijn(String naam, double lengte) {
        super(naam);
        this.lengte = lengte;
    }

    public double getLengte() {
        return lengte;
    }

    @Override
    public double omtrek() {
        return lengte;
    }
}
