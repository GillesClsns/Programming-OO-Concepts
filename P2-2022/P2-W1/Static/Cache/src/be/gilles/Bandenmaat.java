package be.gilles;

public record Bandenmaat (int breedte, int aspect, int velgDiameter) {

    @Override
    public String toString() {
        return String.format("%d/%d R%d", this.breedte, this.aspect, this.velgDiameter);
    }

}
