package be.gilles.types;

import be.gilles.Transportmiddel;

public class Tram extends Transportmiddel {

    public Tram(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "ting";
    }

}
