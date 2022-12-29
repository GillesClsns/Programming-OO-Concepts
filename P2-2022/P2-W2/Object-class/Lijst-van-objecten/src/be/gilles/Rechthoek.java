package be.gilles;

import java.util.Objects;

public class Rechthoek {

    private final int length;
    private final int width;

    public Rechthoek(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rechthoek met lengte %d en breedte %d.", length, width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rechthoek rechthoek)) return false;
        return length == rechthoek.length && width == rechthoek.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
