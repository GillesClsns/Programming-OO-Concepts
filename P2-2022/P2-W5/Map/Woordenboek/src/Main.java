import be.gilles.Woordenboek;
import be.gilles.WoordenboekCreator;

public class Main {

    public static void main(String[] args) {

        Woordenboek woordenboek = WoordenboekCreator.maakWoordenboek();

        System.out.println("Aantal woorden: " + woordenboek.aantalWoorden());
        System.out.println("een - " + woordenboek.vertaal("een"));
        System.out.println("drie - " + woordenboek.vertaal("drie"));
        System.out.println("zeven - " + woordenboek.vertaal("zeven"));
        System.out.println("twaalf - " + woordenboek.vertaal("twaalf"));
    }
}
