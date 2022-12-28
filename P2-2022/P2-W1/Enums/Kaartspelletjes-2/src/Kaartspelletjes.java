import be.gilles.Kaart;
import be.gilles.enums.Kaartwaarde;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kaartspelletjes {

    public static void main(String[] args) {

        Kaart[] kaart = IntStream.range(0, 5).mapToObj(i -> new Kaart()).toArray(Kaart[]::new);
        Arrays.stream(kaart).forEach(System.out::println);

        IntStream stream = Stream.of(kaart).mapToInt(k -> k.getKaartwaarde().getValue());
        System.out.println("Totale waarde: " + stream.sum());

    }

}
