import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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