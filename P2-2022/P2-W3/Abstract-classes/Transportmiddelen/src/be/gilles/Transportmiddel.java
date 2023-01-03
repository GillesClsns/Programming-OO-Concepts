package be.gilles;

public abstract class Transportmiddel {

    private final double snelheid;
    private String geluid;

    public Transportmiddel(double snelheid) {
        this.snelheid = snelheid;
    }

    public double getSnelheid() {
        return snelheid;
    }

    public String getGeluid() {
        return geluid;
    }

    public void legAfstandAf(double afstand) {

        int repetitions = (int) (Math.round(afstand * 10) / getSnelheid());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repetitions; i++) {
            sb.append(getGeluid());
            sb.append(i < repetitions - 1 ? "-" : "");
        }

        System.out.print(sb);

    }

}
