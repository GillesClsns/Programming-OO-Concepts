import be.gilles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Boerderij boerderij = new Boerderij();

        boerderij.voegDierToe(new Konijn("Bugs", true));
        boerderij.voegDierToe(new Koe("Belle", 15.4));
        boerderij.voegDierToe(new Konijn("Bunny", false));
        boerderij.voegDierToe(new Kip("Generaal Kiekens", 3));
        boerderij.voegDierToe(new Kip("Chick", 4));
        boerderij.voegDierToe(new Koe("Hannibal", 4));

        System.out.println("--------\ntoonDieren:\n");
        boerderij.toonDieren();
        System.out.println("--------\nEr ontploft een BOM! Paniek op de boerderij:\n");
        boerderij.toonGeluiden();
        System.out.println("--------\netenstijd:\n");
        boerderij.toonVoeding();
        System.out.println("--------\nzoeken:\n");
        Boerderijdier dier = boerderij.zoekDierOpNaam("Belle");
        if (dier != null) {
            System.out.println(dier);
        } else {
            System.out.println("Belle niet gevonden");
        }
        dier = boerderij.zoekDierOpNaam("Jef");
        if (dier != null) {
            System.out.println(dier);
        } else {
            System.out.println("Jef niet gevonden");
        }

    }

}
