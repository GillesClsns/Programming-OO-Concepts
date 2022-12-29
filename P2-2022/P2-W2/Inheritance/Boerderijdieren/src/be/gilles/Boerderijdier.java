package be.gilles;

public class Boerderijdier {

    private final String naam;
    private final String geluid;
    private final String voeding;

    public Boerderijdier(String naam, String geluid, String voeding) {
        this.naam = naam;
        this.geluid = geluid;
        this.voeding = voeding;
    }

    public String getNaam() {
        return naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public String getVoeding() {
        return voeding;
    }

    @Override
    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s", getNaam(), getGeluid(), getVoeding());
    }

}
