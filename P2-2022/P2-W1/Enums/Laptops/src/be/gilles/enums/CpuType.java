package be.gilles.enums;

public enum CpuType {
    I3, I5, I7;

    @Override
    public String toString() {
        return (name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase()).replace('_', ' ');
    }

}
