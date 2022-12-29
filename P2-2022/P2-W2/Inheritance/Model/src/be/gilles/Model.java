package be.gilles;

public class Model extends Persoon {

    private Maten maten;
    private Adres adres;

    public Model(String naam, int borst, int heup, int taille) {
        super(naam);
        this.maten = new Maten(borst, heup, taille);
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
