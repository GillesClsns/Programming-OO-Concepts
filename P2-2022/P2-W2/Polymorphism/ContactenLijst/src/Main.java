import be.gilles.ContactGegevens;
import be.gilles.Contacten;
import be.gilles.Klant;
import be.gilles.Partner;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Contacten contacten = new Contacten();

        contacten.voegContactToe(new Klant("Bianca Peeters", new ContactGegevens("bianca.pieters@thuis.com", "", "0478/65.25.86"), 201879));
        contacten.voegContactToe(new Klant("Genesis Kiliç", new ContactGegevens("genesis.kilic@home.com", "03/287.89.75", ""), 987968));
        contacten.voegContactToe(new Klant("Robin Dwořak", new ContactGegevens("robin.dworak@dum.com", "03/579.87.99", "0436/85.77.35.11"), 166789));
        contacten.voegContactToe(new Partner("Lucca Verstraete", new ContactGegevens("lucca.verstraete@bedrijf.com", "09/157.99.14", ""), "BE15799318"));
        contacten.voegContactToe(new Partner("Raf Ghazi", new ContactGegevens("raf.ghazi@firma.com", "015/87.77.33", "0433/33.55.78"), "BE87986469"));

        contacten.verwijderContact(0);
        contacten.printContacts();

    }

}
