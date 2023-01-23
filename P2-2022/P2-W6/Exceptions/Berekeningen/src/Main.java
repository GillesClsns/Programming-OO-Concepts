import be.gilles.Getallen;

public class Main {

    public static void main(String[] args) {

        Getallen getallen = new Getallen();
        getallen.voegToe(Math.PI);
        getallen.voegToe(42);
        getallen.voegToe(1.61803);
        getallen.voegToe(-7);
        Getallen getallen2 = new Getallen(getallen);
        getallen.plus(3);
        getallen.maal(getallen2);
        double gemiddelde = getallen.gemiddelde();
        System.out.println("gemiddelde = " + gemiddelde);

    }
}
