package be.gilles;

import java.util.StringJoiner;

public record Vliegtuig(VliegtuigType type, String naam, String maatschappij) {

    @Override
    public String toString() {
        return new StringJoiner(", ", Vliegtuig.class.getSimpleName() + "[", "]")
                .add("type=" + type)
                .add("naam='" + naam + "'")
                .add("maatschappij='" + maatschappij + "'")
                .toString();
    }

}