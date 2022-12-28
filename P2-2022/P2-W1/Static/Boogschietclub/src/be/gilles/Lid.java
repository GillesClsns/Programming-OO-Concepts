package be.gilles;

public class Lid {

    private final int lidnummer;
    private final String naam;
    private static int volgendlid = 10000;

    public Lid(String naam) {

        this.naam = naam;
        this.lidnummer = volgendlid++;

    }

    public int getLidnummer() {
        return lidnummer;
    }

    public String getNaam() {
        return naam;
    }

    public static int getVolgendlid() {
        return volgendlid;
    }

    @Override
    public String toString() {
        return String.format("%d %s", this.getLidnummer(), this.getNaam());
    }

}
