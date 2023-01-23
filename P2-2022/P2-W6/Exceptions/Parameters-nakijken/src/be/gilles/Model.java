package be.gilles;

public class Model extends Persoon {

    private Maten maten;
    private Adres adres;

    public Model(String naam, Maten maten) {
        super(naam);

        if (maten == null)
            throw new IllegalArgumentException("Invalid size");
        if (maten.getBorstomtrek() < 0 || maten.getBorstomtrek() > 200)
            throw new IllegalArgumentException("Invalid bust");
        if (maten.getHeupomtrek() < 0 || maten.getHeupomtrek() > 200)
            throw new IllegalArgumentException("Invalid waist circumference");
        if (maten.getTaille() < 0 || maten.getTaille() > 200)
            throw new IllegalArgumentException("Invalid waist");

        this.maten = maten;
        this.adres = null;
    }

    public Model(String naam) {
        super(naam);
        this.maten = new Maten();
        this.adres = null;
    }

    public Maten getMaten() {
        return maten;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return String.format("""
                Naam: %s
                Adres: %s
                Maten: %s""", getNaam(), getAdres() == null ? "Adres onbekend" : getAdres(), getMaten());
    }

}
