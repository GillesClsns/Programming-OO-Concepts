package be.gilles.objects;

import be.gilles.controller.PrimitiefObject;

public class Bol extends PrimitiefObject {

    private final double straal;

    public Bol(int x, int y, int z, double straal) {
        super(x, y, z);
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * (Math.pow(getStraal(), 3));
    }

    @Override
    public String toString() {
        return String.format("Bol met straal %.1f op plaats %s en volume  %.2f", getStraal(), super.toString(), volume());
    }

}
