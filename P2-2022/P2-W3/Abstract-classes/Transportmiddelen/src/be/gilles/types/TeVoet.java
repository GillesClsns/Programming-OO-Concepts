package be.gilles.types;

import be.gilles.Transportmiddel;

public class TeVoet extends Transportmiddel {

    public TeVoet(double snelheid) {
        super(snelheid);
    }

    @Override
    public String getGeluid() {
        return "stap";
    }

}
