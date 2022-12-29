package be.gilles;

public class Klant extends Contact {

    private final int klantnummer;

    public Klant(String naam, ContactGegevens contactgegevens, int klantnummer) {
        super(naam, contactgegevens);
        this.klantnummer = klantnummer;
    }

    public int getKlantnummer() {
        return klantnummer;
    }

    @Override
    public String toString() {
        return String.format("Klant (%d): %s", getKlantnummer(), super.toString());
    }

}
