package be.gilles.enums;

public enum Merk {
    ACER, APPLE, ASUS, DELL, HP, LENOVO, MEDION, TOSHIBA;

    @Override
    public String toString() {
        return (name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase()).replace('_', ' ');
    }

}
