package be.gilles;

public class Lid {

    public enum Soort {
        GEWOON, STEUNEND, ERELID
    }

    final int id;
    final String naam;
    final Soort soort;

    public Lid(int id, String naam, Soort soort) {

        this.id = id;
        this.naam = naam;
        this.soort = soort;

    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Soort getSoort() {
        return soort;
    }

    @Override
    public String toString() {
        return String.format("%d %-9s soort: %s", this.getId(), this.getNaam(), this.getSoort());
    }

}
