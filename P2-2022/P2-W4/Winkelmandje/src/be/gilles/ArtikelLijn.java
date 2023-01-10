package be.gilles;

public class ArtikelLijn {

    private final Artikel artikel;
    private int aantal;

    public ArtikelLijn(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return artikel.getPrijs();
    }

    public void verhoogAantal() {
        this.aantal++;
    }

    @Override
    public String toString() {
        return String.format("""
                aantal  totaal
                %-5d, %-2.2f EUR""", getAantal(), getPrijs());
    }
}
