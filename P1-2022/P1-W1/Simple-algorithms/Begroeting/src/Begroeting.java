import java.util.Scanner;

public class Begroeting {

    /**
     * Programmeurs zijn misschien niet de meest sociale wezens op deze planeet, maar ze zijn heel beleefd.  Ze kunnen feilloos een programma maken dat een gebruiker begroet.
     * Maak een programma dat de naam van iemand vraagt en dan een begroeting toont.
     */
    public static void main(String[] args) {

        final String username;
        Scanner sc = new Scanner(System.in);

        System.out.print("Wat is je naam? ");
        username = sc.nextLine();

        System.out.printf("Welkom %s!", username);

    }

}
