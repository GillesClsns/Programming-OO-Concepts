package be.gilles.controller;

public class Berghut implements Comparable<Berghut> {

    private final String naam;
    private final int hoogte;
    private final String locatie;

    public Berghut(String naam, int hoogte, String locatie) {
        this.naam = naam;
        this.hoogte = hoogte;
        this.locatie = locatie;
    }

    @Override
    public int compareTo(Berghut o) {
        return naam.compareTo(o.naam);
    }

    @Override
    public String toString() {
        return String.format("%-30s (%dm) --> %s", naam, hoogte, locatie);
    }
}
