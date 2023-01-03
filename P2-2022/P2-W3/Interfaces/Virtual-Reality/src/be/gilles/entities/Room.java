package be.gilles.entities;

import be.gilles.controller.Entity;
import be.gilles.interfaces.Visible;

public class Room extends Entity implements Visible {

    public Room(String name, double[] position) {
        super(name, position);
    }

    @Override
    public void draw() {
        System.out.printf("Room: %s %s", getName(), super.toString());
    }

}
