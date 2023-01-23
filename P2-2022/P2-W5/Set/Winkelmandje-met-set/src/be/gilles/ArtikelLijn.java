package be.gilles;

import java.util.Objects;

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
        return artikel.getPrijs() * getAantal();
    }

    public void verhoogAantal() {
        this.aantal++;
    }

    @Override
    public String toString() {
        return artikel.toString() + String.format("%6d %-4.2f EUR\n", getAantal(), getPrijs());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArtikelLijn that)) return false;
        return artikel.equals(that.artikel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artikel);
    }
}
