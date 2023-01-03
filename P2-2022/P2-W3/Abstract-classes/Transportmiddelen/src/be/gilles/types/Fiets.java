package be.gilles.types;

import be.gilles.Transportmiddel;

public class Fiets extends Transportmiddel {

    public Fiets(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "iepe";
    }

}
