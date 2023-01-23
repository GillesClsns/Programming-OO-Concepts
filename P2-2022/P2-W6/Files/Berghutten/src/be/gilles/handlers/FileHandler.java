package be.gilles.handlers;

import be.gilles.controller.Berghut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    public static List<Berghut> leesBerghutten(String path) throws FileNotFoundException {

        List<Berghut> berghutten = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            String[] data = scanner.nextLine().split(";");
            berghutten.add(new Berghut(data[0], Integer.parseInt(data[1]), data[2]));

        }

        return berghutten;

    }
}
