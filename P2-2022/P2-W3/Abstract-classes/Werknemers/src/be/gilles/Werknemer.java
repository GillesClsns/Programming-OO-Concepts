package be.gilles;

public abstract class Werknemer {

    protected final double UURLOON;
    private final String naam;
    private final long rijksregisternummer;

    public Werknemer(String naam, long nummer) {
        this.naam = naam;
        this.rijksregisternummer = nummer;
        this.UURLOON = 12.5;
    }

    public double getLoon() {
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public long getRijksregisternummer() {
        return rijksregisternummer;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Nummer: %s%n""", getNaam(), getRijksregisternummer());
    }

}
