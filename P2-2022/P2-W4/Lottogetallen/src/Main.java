import be.gilles.LottoGetallen;

public class Main {

    public static void main(String[] args) {

        LottoGetallen getallen = new LottoGetallen();
        for (int i = 0; i < 10; i++) {
            getallen.genereerLottoGetallen();
            System.out.println(getallen.toonLottoGetallen());
        }
    }
}
