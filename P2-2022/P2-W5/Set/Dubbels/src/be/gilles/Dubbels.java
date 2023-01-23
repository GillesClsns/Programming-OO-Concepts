package be.gilles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dubbels {

    private List<String> dubbels;

    public Dubbels(List<String> dubbels) {
        this.dubbels = new ArrayList<>(dubbels);
    }

    public void verwijderDubbels() {
        Set<String> temporary = new HashSet<>(dubbels);
        dubbels = temporary.stream().toList();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dubbels.size(); i++) {

            if (i % 4 == 0) sb.append("\n");
            sb.append(String.format("%-15s", dubbels.get(i)));
        }

        return sb.toString();
    }

}
