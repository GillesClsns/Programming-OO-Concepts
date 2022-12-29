package be.gilles;

public class Partner extends Contact {

    private final String ondernemingsnummer;


    public Partner(String naam, ContactGegevens contactgegevens, String ondernemingsnummer) {
        super(naam, contactgegevens);
        this.ondernemingsnummer = ondernemingsnummer;
    }

    public String getOndernemingsnummer() {
        return ondernemingsnummer;
    }

    @Override
    public String toString() {
        return String.format("Partner (%s): %s", getOndernemingsnummer(), super.toString());
    }

}
