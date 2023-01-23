package be.gilles;

import java.util.Map;
import java.util.TreeMap;

public class Woordenboek {

    private final Map<String, String> woorden;

    public Woordenboek() {
        this.woorden = new TreeMap<>();
    }

    public void voegWoordToe(String woord, String vertaling) {
        this.woorden.put(woord, vertaling);
    }

    public String vertaal(String woord) {
        return this.woorden.getOrDefault(woord, "Vertaling niet gevonden.");
    }

    public int aantalWoorden() {
        return woorden.size();
    }
}
