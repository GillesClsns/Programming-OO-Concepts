package be.gilles.controller;

public abstract class Entity {

    private final String name;
    public double[] position;

    public Entity(String name, double[] position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getPosition(int index) {
        return position[index];
    }

    @Override
    public String toString() {
        return String.format("%s: (%.1f, %.1f, %.1f)", getName(), getPosition(0), getPosition(1), getPosition(2));
    }

}
