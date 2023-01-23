import be.gilles.controller.Berghut;
import be.gilles.handlers.FileHandler;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        List<Berghut> berghutten = FileHandler.leesBerghutten("P2-2022/P2-W6/Files/Berghutten/src/be/gilles/resources/berghutten.csv");
        berghutten.stream().sorted().forEach(System.out::println);

    }
}
