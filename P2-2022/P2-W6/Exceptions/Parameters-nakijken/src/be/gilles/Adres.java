package be.gilles;

public class Adres {

    private final String straatNr;
    private final int postnummer;

    public Adres(String straatNr, int postnummer) {

        if (straatNr.isBlank())
            throw new IllegalArgumentException("Invalid number.");
        this.straatNr = straatNr;

        if (postnummer < 0 || postnummer > 9999)
            throw new IllegalArgumentException("Invalid postal code");
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
