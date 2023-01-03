import be.gilles.Transportmiddel;
import be.gilles.types.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Transportmiddel[] transportmiddelen = new Transportmiddel[]{
                new Bus(50), new Tram(40), new Trein(80), new Fiets(25),
                new TeVoet(5), new Step(20)
        };

        Arrays.stream(transportmiddelen).forEach(x -> {
            x.legAfstandAf(10);
            System.out.println();
        });

    }

}
