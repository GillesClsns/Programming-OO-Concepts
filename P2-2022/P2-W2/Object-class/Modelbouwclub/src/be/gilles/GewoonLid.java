package be.gilles;

public class GewoonLid extends Lid {

    private final String specialiteit;

    public GewoonLid(String naam, long nummer, String specialiteit) {
        super(naam, nummer);
        this.specialiteit = specialiteit;
    }

    public String getSpecialiteit() {
        return specialiteit;
    }

    @Override
    public String toString() {
        return specialiteit + " " + super.toString();
    }

}
