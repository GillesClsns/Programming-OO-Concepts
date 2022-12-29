package be.gilles;

public class Koe extends Boerderijdier {

    private final double literMelkPerDag;

    public Koe(String naam, double literMelkPerDag) {
        super(naam, "Boeboe", "Gras");
        this.literMelkPerDag = literMelkPerDag;
    }

    public double getLiterMelkPerDag() {
        return literMelkPerDag;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " en geeft %.2f liter melk per dag.", getLiterMelkPerDag());
    }

}
