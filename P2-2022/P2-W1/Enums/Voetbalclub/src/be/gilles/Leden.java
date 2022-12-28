package be.gilles;

import java.util.Arrays;

import static be.gilles.Lid.Soort.STEUNEND;

public class Leden {

    private final Lid[] leden;
    private final int MAX;
    private int aantal;

    public Leden() {

        this.MAX = 100;
        this.aantal = 0;
        this.leden = new Lid[MAX];

    }

    public void voegLidToe(Lid lid) {
        this.leden[aantal++] = lid;
    }

    public Lid getLid(int index) {
        return this.leden[index];
    }

    public int getAantal() {
        return aantal;
    }

    public int getAantalActieveLeden() {
        return Arrays.stream(Arrays.copyOfRange(leden, 0, aantal))
                .filter(l -> !l.getSoort().equals(STEUNEND)).toArray().length;
        //return (int) Arrays.stream(leden).filter(lid -> lid.soort == STEUNEND).count();
    }

    public void printActieveLeden() {
        Arrays.stream(Arrays.copyOfRange(leden, 0, aantal))
                .filter(l -> !l.getSoort().equals(STEUNEND)).forEach(System.out::println);
        //Arrays.stream(leden).filter(lid -> lid != null && !lid.soort.equals(STEUNEND)).forEach(System.out::println);
    }

}
