package be.gilles.controller;

public abstract class Figuur {

    private final String naam;

    public Figuur(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

}
