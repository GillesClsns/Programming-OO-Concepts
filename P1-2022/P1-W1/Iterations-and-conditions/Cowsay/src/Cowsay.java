import java.util.Scanner;

public class Cowsay {

    /**
     * Als programmeur wil je je niet altijd nuttig bezighouden.  Gewoon eens een nutteloze, maar leuke app maken, is zeker zo vermakelijk.
     * Maak het programma “cowsay” (kijk eventueel na op Internet) na.
     * De computer vraagt om een zin in te typen.  Vervolgens tekent de computer een koe die deze zin zegt.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geen een zin: ");
        var input = sc.nextLine();

        System.out.printf("""
                ______________________
                < %s >
                ----------------------
                     \\   ^__^
                      \\  (oo)\\_______
                         (__)\\       )\\/\\
                          U ||----w |
                            ||      ||
                """, input);

    }

}
