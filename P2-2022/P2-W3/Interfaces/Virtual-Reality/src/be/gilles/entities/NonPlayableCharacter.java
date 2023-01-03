package be.gilles.entities;

import be.gilles.controller.Entity;
import be.gilles.interfaces.Alive;
import be.gilles.interfaces.Visible;

import java.util.Random;

public class NonPlayableCharacter extends Entity implements Alive, Visible {

    private int numberOfLives;
    Random random;

    public NonPlayableCharacter(String name, double[] position, int numberOfLives) {
        super(name, position);
        this.numberOfLives = (this.numberOfLives < 1) ? 1 : numberOfLives;
        random = new Random(42);
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
        return this.numberOfLives;
    }

    @Override
    public void draw() {
        System.out.printf("Non playable character: %s %s", getName(), super.toString());
    }

    public void animate() {
        for (int i = 0; i < position.length; i++) {
            position[i] += random.nextInt(-10, 11);
        }
    }

    public boolean isAlive() {
        return this.numberOfLives >= 1;
    }

}
