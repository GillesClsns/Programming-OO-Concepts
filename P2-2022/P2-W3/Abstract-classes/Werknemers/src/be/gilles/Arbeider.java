package be.gilles;

public class Arbeider extends Werknemer {

    private final int MAX_UREN_PW;
    private final int aantalUren;

    public Arbeider(String naam, long nummer, int aantalUren) {
        super(naam, nummer);
        this.MAX_UREN_PW = 38;
        this.aantalUren = aantalUren;
    }

    @Override
    public double getLoon() {

        int remaining = aantalUren - MAX_UREN_PW;

        if (remaining <= 0)
            return aantalUren * super.UURLOON;

        return (MAX_UREN_PW * super.UURLOON) + (remaining * (12.5 * 1.5));
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Loon: €%.1f", getLoon());
    }

}
