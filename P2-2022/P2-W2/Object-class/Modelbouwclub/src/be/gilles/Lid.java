package be.gilles;

import java.util.Objects;

public class Lid {

    private final String naam;
    private final long nummer;

    public Lid(String naam, long nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public long getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lid lid = (Lid) o;
        return nummer == lid.nummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummer);
    }

}
