import be.gilles.Kip;
import be.gilles.Koe;
import be.gilles.Konijn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        List<Object> animals = List.of(
                new Konijn("Bugs", true),
                new Koe("Belle", 15.4),
                new Konijn("Bunny", false),
                new Kip("Generaal Kiekens", 3),
                new Kip("Chick", 4),
                new Koe("Hannibal", 0));

        animals.forEach(System.out::println);

    }

}
