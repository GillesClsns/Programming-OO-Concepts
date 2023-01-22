package be.gilles;

import java.util.Objects;

public class Acteur implements Comparable<Acteur> {

    private final String naam;
    private final int geboortejaar;

    public Acteur(String naam, int geboortejaar) {
        this.naam = naam;
        this.geboortejaar = geboortejaar;
    }

    public String getNaam() {
        return naam;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Acteur acteur)) return false;
        return geboortejaar == acteur.geboortejaar && naam.equals(acteur.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, geboortejaar);
    }

    @Override
    public int compareTo(Acteur o) {

        int compareInteger = Integer.compare(getGeboortejaar(), o.getGeboortejaar());

        if (compareInteger != 0) {
            return compareInteger;
        }

        return getNaam().compareTo(o.getNaam());
    }

    @Override
    public String toString() {
        return String.format("%d %s", getGeboortejaar(), getNaam());
    }
}
