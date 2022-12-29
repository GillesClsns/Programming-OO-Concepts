package be.gilles.controller;

public class PrimitiefObject {

    private final int[] plaats;

    public PrimitiefObject() {
        this.plaats = new int[]{0, 0, 0};
    }

    public PrimitiefObject(int x, int y, int z) {
        this();
        this.plaats[0] = x;
        this.plaats[1] = y;
        this.plaats[2] = z;
    }

    public int getX() {
        return this.plaats[0];
    }

    public int getY() {
        return this.plaats[1];
    }

    public int getZ() {
        return this.plaats[2];
    }

    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", getX(), getY(), getZ());
    }

}
