package be.gilles;

import java.util.Arrays;

public class Lijst {

    private final int MAX_CAPACITY;
    private final Object[] objects;
    private int amount;

    public Lijst() {
        this.MAX_CAPACITY = 100;
        this.objects = new Object[MAX_CAPACITY];
        this.amount = 0;
    }

    public boolean voegToe(Object object) {
        if (amount >= MAX_CAPACITY) return false;
        else this.objects[amount++] = object;
        return true;
    }

    public Object zoek(int index) {
        return index > amount ? null : this.objects[index];
    }

    public boolean zoek(Object object) {

        for (Object obj : objects) {

            if (object.getClass().isArray() && obj.getClass().isArray())
                return Arrays.equals((int[]) obj, (int[]) object);
            if (object.equals(obj))
                return true;

        }
        return false;

    }

    public int getAmount() {
        return amount;
    }

}
