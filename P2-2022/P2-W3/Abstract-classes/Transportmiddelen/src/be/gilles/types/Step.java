package be.gilles.types;

import be.gilles.Transportmiddel;

public class Step extends Transportmiddel {

    public Step(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "zzz";
    }

}
