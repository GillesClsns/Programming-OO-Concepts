package be.gilles;

public record Auto(String merk, String model, Bandenmaat bandenmaat) {

    @Override
    public String toString() {
        return String.format("%-15s %s", String.format("%s %s", this.merk, this.model), this.bandenmaat);
    }

}
