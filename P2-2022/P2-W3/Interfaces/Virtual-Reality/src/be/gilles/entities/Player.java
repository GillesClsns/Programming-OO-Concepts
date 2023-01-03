package be.gilles.entities;

import be.gilles.controller.Entity;
import be.gilles.interfaces.Alive;
import be.gilles.interfaces.Visible;

public class Player extends Entity implements Visible, Alive {

    private int numberOfLives;

    public Player(String name, double[] position, int numberOfLives) {
        super(name, position);
        this.numberOfLives = numberOfLives;
    }

    @Override
    public void kill() {
        if (isAlive()) {
            System.out.printf("%s: Aaaaaaarrrrrrgggghhh", getName());
            this.numberOfLives--;
        } else System.out.printf("%s is dood.", getName());
    }

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void draw() {
        System.out.printf("Player: %s %s", getName(), super.toString());
    }


    public boolean isAlive() {
        return this.numberOfLives >= 1;
    }

}
