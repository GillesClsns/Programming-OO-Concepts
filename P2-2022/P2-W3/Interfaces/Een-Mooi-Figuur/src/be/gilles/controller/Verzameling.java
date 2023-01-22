package be.gilles.controller;

import be.gilles.entities.*;
import be.gilles.interfaces.HeeftOmtrek;
import be.gilles.interfaces.HeeftOppervlakte;
import be.gilles.interfaces.HeeftVolume;

public class Verzameling {

    private Figuur[] figuren;
    private int aantal;

    public Verzameling() {

        figuren = new Figuur[10];
        figuren[0] = new Punt("punt");
        figuren[1] = new Lijn("lijn1", 10);
        figuren[2] = new Rechthoek("rechthoek1", 10, 20);
        figuren[3] = new Vierkant("vierkant", 8);
        figuren[4] = new Balk("balk1", new Rechthoek("rechthoek", 12, 13), 3);
        figuren[5] = new Bol("bol", 5);
        figuren[6] = new Balk("balk2", new Rechthoek("rechthoek", 11, 4), 2);
        figuren[7] = new Rechthoek("rechthoek2", 5, 6);
        figuren[8] = new Rechthoek("rechthoek3", 8, 9);
        figuren[9] = new Lijn("lijn2", 3);
    }

    public double totaleOmtrek() {

        double omtrek = 0;
        for (Figuur figuur : figuren) {
            if (figuur instanceof HeeftOmtrek heeftOmtrek)
                omtrek += heeftOmtrek.omtrek();
        }
        return omtrek;

    }

    public double totaleOppervlakte() {
        double oppervlakte = 0;
        for (Figuur figuur : figuren) {
            if (figuur instanceof HeeftOppervlakte heeftOppervlakte)
                oppervlakte += heeftOppervlakte.oppervlakte();
        }
        return oppervlakte;

    }

    public double totaalVolume() {

        double volume = 0;
        for (Figuur figuur : figuren) {
            if (figuur instanceof HeeftVolume heeftVolume)
                volume += heeftVolume.volume();
        }
        return Math.round(volume);

    }

}