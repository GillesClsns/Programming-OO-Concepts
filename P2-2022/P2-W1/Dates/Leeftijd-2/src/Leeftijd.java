import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Leeftijd {

    /**
     * Schrijf een programma om aan de hand van je geboortedatum te berekenen hoeveel jaren, maanden en dagen je oud bent.
     * <p>
     * Vraag de gebruiker zijn geboortedatum in te geven als 3 afzonderlijke gehele getallen (op verschillende regels zoals in het voorbeeld).
     * Geef nu weer hoeveel jaren, maanden en dagen de gebruiker oud is.
     * Geef ook weer op welke dag van de week de gebruiker geboren is.
     */
    public static void main(String[] args) {

        Locale dutch = new Locale("nl", "BE");

        int day = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortedag: "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortemaand: "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Geef je geboortejaar: "));

        LocalDate birthYear = LocalDate.of(year, month, day);
        DayOfWeek dayOfBirth = LocalDate.of(year, month, day).getDayOfWeek();
        String dayOfWeekInDutch = dayOfBirth.getDisplayName(TextStyle.FULL, dutch);

        year = Math.abs(Period.between(LocalDate.now(), birthYear).getYears());
        month = Math.abs(Period.between(LocalDate.now(), birthYear).getMonths());
        day = Math.abs(Period.between(LocalDate.now(), birthYear).getDays());

        JOptionPane.showMessageDialog(null, String.format("Je bent nu %d jaren %d maanden en %d dagen oud.\nJe bent geboren op een %s.",
                year, month, day, dayOfWeekInDutch));

    }

}
