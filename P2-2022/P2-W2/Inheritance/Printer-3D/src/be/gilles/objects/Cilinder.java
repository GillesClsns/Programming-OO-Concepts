package be.gilles.objects;

import be.gilles.controller.PrimitiefObject;

public class Cilinder extends PrimitiefObject {

    private final double straal;
    private final double hoogte;

    public Cilinder(int x, int y, int z, double straal, double hoogte) {
        super(x, y, z);
        this.straal = straal;
        this.hoogte = hoogte;
    }

    public double getStraal() {
        return straal;
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public double volume() {
        return Math.PI * (Math.pow(getStraal(), 2)) * (getHoogte());
    }

    @Override
    public String toString() {
        return String.format("Cilinder met straal %.1f en hoogte %.1f op plaats %s en volume %.2f", getStraal(), getHoogte(), super.toString(), volume());
    }

}
