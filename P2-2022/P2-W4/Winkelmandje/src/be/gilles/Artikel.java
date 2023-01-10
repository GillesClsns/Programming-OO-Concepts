package be.gilles;

public abstract class Artikel {

    private final String id;
    private final double prijs;

    public Artikel(String id, double prijs) {
        this.id = id;
        this.prijs = prijs;
    }

    public String getId() {
        return id;
    }

    public double getPrijs() {
        return prijs;
    }

}
