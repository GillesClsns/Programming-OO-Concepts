package be.gilles;

public class Konijn extends Boerderijdier {

    private final boolean isGraver;

    public Konijn(String naam, boolean isGraver) {
        super(naam, "Snifsnif", "Gras");
        this.isGraver = isGraver;
    }

    public boolean isGraver() {
        return isGraver;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "en graaft %s.", isGraver() ? "wel" : "niet");
    }

}
