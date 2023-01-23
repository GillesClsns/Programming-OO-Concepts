package be.gilles.instances;

public class Patient {

    private int id;
    private final String naam;
    private int huisartsId;

    public Patient(String naam) {
        this.naam = naam;
        this.id = -1;
        this.huisartsId = -1;
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

    public int getHuisartsId() {
        return huisartsId;
    }

    public void setHuisartsId(int huisartsId) {
        this.huisartsId = huisartsId;
    }

    @Override
    public String toString() {
        return String.format("%10s | %-20s |", getId(), getNaam());
    }
}
