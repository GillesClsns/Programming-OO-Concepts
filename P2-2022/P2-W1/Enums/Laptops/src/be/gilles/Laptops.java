package be.gilles;

import java.util.Arrays;
import java.util.Objects;

public class Laptops {

    private final Laptop[] laptops;
    private int aantal;

    public Laptops() {

        this.laptops = new Laptop[2000];
        this.aantal = 0;

    }

    public void voegToe(Laptop laptop) {
        this.laptops[aantal++] = laptop;
    }

    public int getAantal() {
        return aantal;
    }

    public Laptop getLaptop(int index) {
        return this.laptops[index];
    }

    public void printInventory() {
        System.out.printf("Er zijn %d laptops:%n", getAantal());
        Arrays.stream(laptops).filter(Objects::nonNull).forEach(System.out::println);
    }

}
