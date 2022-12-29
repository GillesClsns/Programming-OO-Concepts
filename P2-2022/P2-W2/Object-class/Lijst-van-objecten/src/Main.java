import be.gilles.Lijst;
import be.gilles.Rechthoek;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Lijst lijst = new Lijst();
        lijst.voegToe("Hallo");
        lijst.voegToe(LocalDate.now());
        lijst.voegToe(new Random());
        lijst.voegToe(new int[]{1, 2, 3});
        lijst.voegToe(new Rechthoek(10, 20));

        for (int i = 0; i < lijst.getAmount(); i++) {
            System.out.println(lijst.zoek(i));
        }

        if (lijst.zoek("Hallo")) System.out.println("De string werd gevonden");
        else System.out.println("De string werd niet gevonden");

        if (lijst.zoek(new int[]{1, 2, 3})) System.out.println("De array werd gevonden");
        else System.out.println("De array werd niet gevonden");

        if (lijst.zoek(new Rechthoek(10, 20))) System.out.println("De rechthoek werd gevonden");
        else System.out.println("De rechthoek werd niet gevonden");

    }

}
