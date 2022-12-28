package be.gilles.enums;

public enum Kaartwaarde {
    AAS(1), TWEE(2), DRIE(3), VIER(4), VIJF(5), ZES(6), ZEVEN(7), ACHT(8), NEGEN(9) , TIEN(10), BOER(10), DAME(10), HEER(10);

    private final int value;

    Kaartwaarde(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
