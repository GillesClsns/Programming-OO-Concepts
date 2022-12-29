package be.gilles;


import static be.gilles.Telefoonnummer.Soort.*;

public class Telefoonnummer {

    enum Soort {
        VAST, MOBIEL
    }

    private final Soort soort;
    private final String nummer;

    public Telefoonnummer(Soort soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    public Soort getSoort() {
        return soort;
    }

    public String getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getNummer(),
                getSoort() == Soort.VAST ? "V" : "M");
    }

}
