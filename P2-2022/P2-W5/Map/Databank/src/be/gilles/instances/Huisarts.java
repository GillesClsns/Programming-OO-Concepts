package be.gilles.instances;

public class Huisarts {

    private int id;
    private final String naam;

    public Huisarts(String naam) {
        this.naam = naam;
        this.id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }
}
