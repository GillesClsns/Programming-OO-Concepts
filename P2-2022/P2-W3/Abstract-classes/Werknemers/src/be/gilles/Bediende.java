package be.gilles;

public class Bediende extends Werknemer {

    private final int LOONFACTOR;
    private final double weddeBarema;

    public Bediende(String naam, long nummer, double weddeBarema) {
        super(naam, nummer);
        this.weddeBarema = weddeBarema;
        this.LOONFACTOR = 192;
    }

    @Override
    public double getLoon() {
        return UURLOON * LOONFACTOR * weddeBarema;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Loon: €%.1f", getLoon());
    }

}
