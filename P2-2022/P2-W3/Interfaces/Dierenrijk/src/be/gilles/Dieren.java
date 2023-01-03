package be.gilles;

import be.gilles.interfaces.Dier;

import java.util.Arrays;
import java.util.Objects;

public class Dieren {

    private final Dier[] dieren;
    private int aantal;

    public Dieren() {
        this.dieren = new Dier[100];
        this.aantal = 0;
    }

    public void voegToe(Dier dier) {
        this.dieren[aantal++] = dier;
    }

    public void toon() {
        Arrays.stream(dieren).filter(Objects::nonNull).forEach(System.out::println);
    }

}
