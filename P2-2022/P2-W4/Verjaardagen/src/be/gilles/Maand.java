package be.gilles;

public enum Maand {
    JANUARI(0), FEBRUARI(1), MAART(2), APRIL(3), MEI(4), JUNI(5), JULI(6), AUGUSTUS(7), SEPTEMBER(8), OKTOBER(9), NOVEMBER(10), DECEMBER(11);

    private final int value;

    Maand(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
