package be.gilles.types;

import be.gilles.Transportmiddel;

public class Trein extends Transportmiddel {

    public Trein(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "tuut";
    }

}
