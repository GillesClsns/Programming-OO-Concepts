package be.gilles;

public class Maten {

    private final int borstomtrek;
    private final int heupomtrek;
    private final int taille;

    public Maten(int borstomtrek, int heupomtrek, int taille) {

        this.borstomtrek = borstomtrek;
        this.heupomtrek = heupomtrek;
        this.taille = taille;

    }

    public Maten() {

        this.borstomtrek = 90;
        this.heupomtrek = 60;
        this.taille = 90;

    }

    public int getBorstomtrek() {
        return borstomtrek;
    }

    public int getHeupomtrek() {
        return heupomtrek;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", getBorstomtrek(), getHeupomtrek(), getTaille());
    }

}
