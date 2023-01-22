package be.gilles;

public record Datum(int dag, Maand maand) implements Comparable<Datum> {

    @Override
    public int compareTo(Datum o) {
        if (maand().getValue() != o.maand().getValue()) return maand().getValue() - o.maand().getValue();
        else return dag() - o.dag();
    }

    @Override
    public String toString() {
        return String.format("%d %s", dag(), maand().toString().toLowerCase());
    }
}

