import be.gilles.Auto;
import be.gilles.BandenmaatFactory;

import java.util.List;

public class Cache {

    public static void main(String[] args) {

        List<Auto> wagens = List.of(
                new Auto("renault", "clio", BandenmaatFactory.maak(185, 65, 15)),
                new Auto("dacia", "sandero", BandenmaatFactory.maak(185, 65, 15)),
                new Auto("bmw", "4 serie", BandenmaatFactory.maak(225, 35, 20)),
                new Auto("citroen", "c3", BandenmaatFactory.maak(185, 65, 15)));

        wagens.forEach(System.out::println);

    }

}
