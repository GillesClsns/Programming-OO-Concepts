package be.gilles;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Boerderij {

    private final Boerderijdier[] dieren;
    private int aantalDieren;

    public Boerderij() {
        this.dieren = new Boerderijdier[5];
        this.aantalDieren = 0;
    }

    public void voegDierToe(Boerderijdier boerderijdier) {
        if (aantalDieren >= 5)
            System.err.printf("Er is een plaats meer voor %s. De stal zit vol!%n", boerderijdier.getNaam());
        else dieren[aantalDieren++] = boerderijdier;
    }

    public void toonDieren() {
        Arrays.stream(dieren)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }

    public void toonGeluiden() {
        Arrays.stream(dieren)
                .filter(Objects::nonNull)
                .forEach(d -> System.out.printf("%s maakt geluid %s%n", d.getNaam(), d.getGeluid()));
    }

    public void toonVoeding() {
        Arrays.stream(dieren)
                .filter(Objects::nonNull)
                .forEach(d -> System.out.printf("%s eet %s%n", d.getNaam(), d.getVoeding()));
    }

    public Boerderijdier zoekDierOpNaam(String naam) {

        for (Boerderijdier dier : dieren) {
            if (dier.getNaam().equals(naam)) return dier;
        }

        return null;
    }

}
