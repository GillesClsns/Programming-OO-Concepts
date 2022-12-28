package be.gilles;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class BandenmaatFactory {

    static Bandenmaat[] bandenmaatCache = new Bandenmaat[100];
    static int aantal = 0;

    public static Bandenmaat maak(int breedte, int aspect, int velgDiameter) {

        for (int i = 0; i < aantal; i++) {

            if ((bandenmaatCache[i].aspect() == breedte) &&
                    (bandenmaatCache[i].aspect() == aspect) &&
                    (bandenmaatCache[i].velgDiameter() == velgDiameter)) {

                return bandenmaatCache[i];
            }

        }

        Bandenmaat bandenmaat = new Bandenmaat(breedte, aspect, velgDiameter);
        return bandenmaatCache[aantal++] = bandenmaat;

    }

}
