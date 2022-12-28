package be.gilles;

public enum Continent {
    NOORD_AMERIKA(24256000, 470),
    LATIJNS_AMERIKA(17819000, 331),
    EUROPA(10530750, 728),
    AZIE(44579000, 3604),
    AFRIKA(30665000, 654.5),
    AUSTRALIE(8535117, 29.5),
    ANTARCTICA(13209000, 0);

    private final long oppervlakte;
    private final double inwoners;

    Continent(long oppervlakte, double inwoners) {

        this.oppervlakte = oppervlakte;
        this.inwoners = inwoners;

    }

    public int bevolkingsDichtheid() {
        return (int) ((inwoners * 1000000) / oppervlakte);
    }

    @Override
    public String toString() {
        return String.format("%s (bev. dichth: %d)", name(),bevolkingsDichtheid());
    }

}
