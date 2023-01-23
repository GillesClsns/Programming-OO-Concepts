package be.gilles;

import java.util.Comparator;

public class PilotenComparator implements Comparator<Piloot> {

    @Override
    public int compare(Piloot o1, Piloot o2) {

        String[] nameO1 = o1.getNaam().split(" ");
        String lastNameO1 = nameO1.length == 2 ? nameO1[1] : nameO1[2];

        String[] nameO2 = o2.getNaam().split(" ");
        String lastNameO2 = nameO2.length == 2 ? nameO2[1] : nameO2[2];

        return lastNameO1.compareTo(lastNameO2);

    }
}
