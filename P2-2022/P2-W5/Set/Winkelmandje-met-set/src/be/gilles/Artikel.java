package be.gilles;

import java.util.Objects;

public abstract class Artikel {

    private final String id;
    private final double prijs;

    public Artikel(String id, double prijs) {
        this.id = id;
        this.prijs = prijs;
    }

    public String getId() {
        return id;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getTitel() {
        return this.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artikel artikel)) return false;
        return id.equals(artikel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
