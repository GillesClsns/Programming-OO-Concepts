package be.gilles;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Broden {

    private final Brood[] broden;
    private int aantal;
    private int volgendNUmmer;

    public Broden() {

        this.broden = new Brood[100];
        this.aantal = 0;
        this.volgendNUmmer = 1000;

    }

    public void voegBroodToe(Brood.Soort soort, LocalDate vervaldatum) {
        this.broden[aantal++] = new Brood(volgendNUmmer++, soort, vervaldatum);
    }

    public void printBroden() {
        Arrays.stream(broden).filter(Objects::nonNull).forEach(System.out::println);
    }

    public void printVervallenBroden(LocalDate date) {
        Arrays.stream(broden)
                .filter(Objects::nonNull)
                .filter(brood -> brood.getVervaldatum().equals(date))
                .forEach(System.out::println);
    }

}
