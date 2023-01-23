package be.gilles;

import java.util.HashSet;
import java.util.Set;

public class Piloot {

    private final String nationaliteit;
    private final String naam;
    private final int aantalTitels;
    private final Set<Integer> seizoenen;

    public Piloot(String nationaliteit, String naam, int aantalTitels) {
        this.seizoenen = new HashSet<>();
        this.nationaliteit = nationaliteit;
        this.naam = naam;
        this.aantalTitels = aantalTitels;
    }

    public void voegSeizoenToe(int jaartal) {
        this.seizoenen.add(jaartal);
    }

    public String getNationaliteit() {
        return nationaliteit;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalTitels() {
        return aantalTitels;
    }

    public Set<Integer> getSeizoenen() {
        return seizoenen;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %d %s", getNationaliteit(), getNaam(), getAantalTitels(), getSeizoenen());
    }
}
