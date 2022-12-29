package be.gilles;

public class Adres {

    private final String straatNr;
    private final int postnummer;

    public Adres(String straatNr, int postnummer) {

        this.straatNr = straatNr;
        this.postnummer = postnummer;

    }

    public String getStraatNr() {
        return straatNr;
    }

    public int getPostnummer() {
        return postnummer;
    }

    @Override
    public String toString() {
        return String.format("%s %d", getStraatNr(), getPostnummer());
    }

}
