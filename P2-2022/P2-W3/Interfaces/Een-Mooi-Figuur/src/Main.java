import be.gilles.controller.Verzameling;

public class Main {

    public static void main(String[] args) {

        Verzameling verzameling = new Verzameling();
        System.out.println(verzameling.totaleOmtrek());
        System.out.println(verzameling.totaleOppervlakte());
        System.out.println(verzameling.totaalVolume());
    }
}
