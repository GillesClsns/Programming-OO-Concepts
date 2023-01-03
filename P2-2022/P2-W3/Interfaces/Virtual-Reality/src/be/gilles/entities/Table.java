package be.gilles.entities;

import be.gilles.controller.Entity;
import be.gilles.interfaces.Movable;
import be.gilles.interfaces.Visible;

public class Table extends Entity implements Movable, Visible {

    public Table(String name, double[] position) {
        super(name, position);
    }

    @Override
    public void move(double[] cords) {
        for (int i = 0; i < position.length; i++) {
            position[i] += cords[i];
        }
    }

    @Override
    public void draw() {
        System.out.printf("Table: %s %s", getName(), super.toString());
    }

}
