package be.gilles;

public class Persoon implements Comparable<Persoon> {

    private final String naam;
    private final Datum verjaardag;

    public Persoon(String naam, Datum verjaardag) {
        this.naam = naam;
        this.verjaardag = verjaardag;
    }

    public Persoon(String naam, int dag, Maand maand) {
        this.naam = naam;
        this.verjaardag = new Datum(dag, maand);
    }

    public String getNaam() {
        return naam;
    }

    public Datum getVerjaardag() {
        return verjaardag;
    }

    @Override
    public int compareTo(Persoon o) {
        return getNaam().compareTo(o.getNaam());
    }

    @Override
    public String toString() {
        return String.format("%-15s --> %s", getNaam(), getVerjaardag());
    }
}
