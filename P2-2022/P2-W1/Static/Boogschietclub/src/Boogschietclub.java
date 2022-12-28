import be.gilles.Lid;

import java.util.Arrays;
import java.util.List;

public class Boogschietclub {

    public static void main(String[] args) {

        Lid[] leden = {
                new Lid("Murtadha"),
                new Lid("Bart"),
                new Lid("Alikhan"),
                new Lid("Emma"),
                new Lid("Bo"),
                new Lid("Dachi")
        };

        Arrays.stream(leden).forEach(System.out::println);
        System.out.println("Het volgende lidnummer is: " + Lid.getVolgendlid());

    }

}
