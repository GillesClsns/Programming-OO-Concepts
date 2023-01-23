package be.gilles;

public class Persoon {

    private final String naam;

    public Persoon(String naam) {
        if (naam.isBlank()) throw new IllegalArgumentException("Invalid name");
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return naam;
    }

}
