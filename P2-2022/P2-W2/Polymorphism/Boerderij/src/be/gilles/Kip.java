package be.gilles;

public class Kip extends Boerderijdier {

    private final int eierenPerWeek;

    public Kip(String naam, int eierenPerWeek) {
        super(naam, "Toktok", "mais");
        this.eierenPerWeek = eierenPerWeek;
    }

    public int getEierenPerWeek() {
        return eierenPerWeek;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " en legt %d eieren per week.", getEierenPerWeek());
    }

}
