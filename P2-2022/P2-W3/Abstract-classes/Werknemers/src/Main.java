import be.gilles.Arbeider;
import be.gilles.Bediende;
import be.gilles.Werknemer;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {

        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };

        Arrays.stream(werknemers).forEach(x -> {
            System.out.println(x + "\n");
        });

        double sum = Arrays.stream(werknemers).mapToDouble(Werknemer::getLoon).sum();
        System.out.println("Som lonen: €" + sum);

    }

}

