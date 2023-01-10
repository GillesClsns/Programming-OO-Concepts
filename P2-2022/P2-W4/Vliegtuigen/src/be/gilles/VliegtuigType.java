package be.gilles;

public record VliegtuigType(String code, String omschrijving) {

    @Override
    public String toString() {
        return "VliegtuigType{" +
                "code='" + code + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';

    }

}
