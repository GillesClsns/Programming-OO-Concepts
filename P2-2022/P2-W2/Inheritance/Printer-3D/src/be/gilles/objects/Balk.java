package be.gilles.objects;

import be.gilles.controller.PrimitiefObject;

public class Balk extends PrimitiefObject {

    private final double[] afmetingen;

    public Balk(int x, int y, int z, double breedte, double hoogte, double diepte) {
        super(x, y, z);
        this.afmetingen = new double[]{breedte, hoogte, diepte};
    }

    public double getBreedte() {
        return afmetingen[0];
    }

    public double getHoogte() {
        return afmetingen[1];
    }

    public double getDiepte() {
        return afmetingen[2];
    }

    @Override
    public double volume() {
        return (afmetingen[0] * afmetingen[1] * afmetingen[2]);
    }

    @Override
    public String toString() {
        return String.format("Balk met afmetingen (%.1f, %.1f, %.1f) op plaats %s en volume %.2f", getBreedte(), getHoogte(), getDiepte(), super.toString(), volume());
    }

}
