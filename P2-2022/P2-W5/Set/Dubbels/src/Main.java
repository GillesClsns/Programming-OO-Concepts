import be.gilles.Data;
import be.gilles.Dubbels;

public class Main {

    public static void main(String[] args) {

        Dubbels dubbels = new Dubbels(Data.getData());

        System.out.println("Origineel:\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\nNa verwijderen dubbels:\n" + dubbels);
    }

}
