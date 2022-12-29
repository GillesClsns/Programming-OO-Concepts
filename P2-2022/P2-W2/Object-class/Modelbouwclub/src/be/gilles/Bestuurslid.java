package be.gilles;

import java.util.Objects;

public class Bestuurslid extends Lid {

    private final String functie;

    public Bestuurslid(String naam, long nummer, String functie) {
        super(naam, nummer);
        this.functie = functie;
    }

    public String getFunctie() {
        return functie;
    }

    @Override
    public String toString() {
        return functie + " " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bestuurslid that = (Bestuurslid) o;
        return functie.equals(that.functie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), functie);
    }

}
