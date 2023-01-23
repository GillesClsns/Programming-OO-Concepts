package be.gilles;

import java.util.ArrayList;
import java.util.List;

public class Getallen {

    private final List<Double> getallen;

    public Getallen() {
        this.getallen = new ArrayList<>();
    }

    public Getallen(Getallen getallen) {
        this.getallen = getallen.getallen;
    }

    public void voegToe(double d) {
        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Invalid number");
        }
        getallen.add(d);
    }

    public void plus(double d) {

        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Invalid number");
        }

        getallen.replaceAll(aDouble -> aDouble + d);

    }

    public void plus(Getallen getallen) {

        if (this.getallen.size() != getallen.getallen.size()) {
            throw new ArithmeticException("Invalid sizes");
        }

        for (int i = 0; i < this.getallen.size(); i++) {
            this.getallen.set(i, getallen.getallen.get(i) + this.getallen.get(i));
        }

    }

    public void maal(double d) {

        if (Double.isNaN(d) || d == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Invalid number");
        }

        getallen.replaceAll(aDouble -> aDouble * d);

    }

    public void maal(Getallen getallen) {

        if (this.getallen.size() != getallen.getallen.size()) {
            throw new ArithmeticException("Invalid sizes");
        }

        for (int i = 0; i < this.getallen.size(); i++) {
            this.getallen.set(i, getallen.getallen.get(i) * this.getallen.get(i));
        }

    }

    public double gemiddelde() {
        return getallen.stream().mapToDouble(a -> a).average().orElse(0.0);
    }

}
