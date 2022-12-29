package be.gilles.objects;

import be.gilles.controller.PrimitiefObject;

public class Kubus extends Balk {

    public Kubus(int x, int y, int z, double breedte) {
        super(x, y, z, breedte, breedte, breedte);
    }

    @Override
    public String toString() {
        return String.format("Kubus met zijde %.2f op plaats %s en volume %.2f", getBreedte(), super.toString(), volume());
    }

}
