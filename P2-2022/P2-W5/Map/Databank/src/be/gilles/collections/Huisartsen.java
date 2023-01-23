package be.gilles.collections;

import be.gilles.instances.Huisarts;

import java.util.HashMap;
import java.util.Map;

public class Huisartsen {

    public static int volgendId = 0;
    private final Map<Integer, Huisarts> artsen;

    public Huisartsen() {
        this.artsen = new HashMap<>();
    }

    public void insert(Huisarts huisarts) {
        huisarts.setId(volgendId);
        artsen.put(volgendId++, huisarts);
    }

    public boolean delete(int id) {

        if (artsen.containsKey(id)) {
            artsen.remove(id);
            return true;
        } else return false;
    }

    public Huisarts findById(int id) {
        return artsen.get(id);
    }
}
