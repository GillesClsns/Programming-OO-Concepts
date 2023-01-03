import be.gilles.Dieren;
import be.gilles.entities.Arend;
import be.gilles.entities.Struisvogel;
import be.gilles.entities.Zwaluw;
import be.gilles.interfaces.Dier;
import be.gilles.interfaces.Eierleggend;
import be.gilles.interfaces.Vliegend;

public class Main {

    public static void main(String[] args) {

        Dieren dieren = new Dieren();

        dieren.voegToe(new Arend("eagle", 2, 50, 160));
        dieren.voegToe(new Struisvogel("struis", 6));
        dieren.voegToe(new Zwaluw("schwalbe", 4, 120));
        dieren.toon();

        Dier dier = new Arend("eagle", 2, 50, 160);
        Vliegend vliegend = new Arend("eagle", 2, 50, 160);
        Eierleggend eierleggend = new Arend("eagle", 2, 50, 160);

        System.out.println(dier);
        System.out.println(vliegend);
        System.out.println(eierleggend);

    }

}