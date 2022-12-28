package be.gilles;

import java.time.LocalDate;

public class Brood {

    public enum Soort {
        GROF, WIT;
    }

    private final int nummer;
    private final Soort soort;
    private final LocalDate vervaldatum;

    public Brood(int nummer, Soort soort, LocalDate vervaldatum) {

        this.nummer = nummer;
        this.soort = soort;
        this.vervaldatum = vervaldatum;

    }

    public int getNummer() {
        return nummer;
    }

    public Soort getSoort() {
        return soort;
    }

    public LocalDate getVervaldatum() {
        return vervaldatum;
    }

    @Override
    public String toString() {
        return String.format("[#%d] %s -> %s", getNummer(), getSoort(), getVervaldatum());
    }

}
