import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ramadan {

    /**
     * Wanneer begint de Ramadan?  Dat is niet zo eenvoudig te zeggen want dat hangt af van wanneer je het begin van de nieuwe maan kan zien.  En dat hangt dan weer af van de plaats op aarde en wie de waarnemingen doet.
     * <p>
     * Gelukkig kunnen we wel een schatting maken.  De maan doorloopt namelijk een volledige cyclus op 29,53 dagen.  Om de 12 maancyclussen begint de Ramadan.  Als we dus een begindatum kiezen er er steeds 29,53*12 dagen bijtellen, hebben we een schatting voor het begin van de Ramadan.
     * <p>
     * Als je weet dat het begin van de Ramadan op 2 april 2022 viel, wanneer schat je dan dat de ramadan zal beginnen in 2023, 2024 en 2025?
     * Maak een programma dat deze schattingen maakt.
     */
    public static void main(String[] args) {

        System.out.println("Dit programma schat dat de Ramadan op volgende datums zal starten:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (LocalDate date = LocalDate.of(2022, 4, 2);
             date.isBefore(LocalDate.of(2026, 1, 1));
             date = date.plusDays(354))
            System.out.println(formatter.format(date));

    }

}
