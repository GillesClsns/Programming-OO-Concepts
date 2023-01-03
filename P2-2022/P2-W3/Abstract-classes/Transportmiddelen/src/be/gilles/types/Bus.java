package be.gilles.types;

import be.gilles.Transportmiddel;

public class Bus extends Transportmiddel {

    public Bus(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "vroem";
    }

}
