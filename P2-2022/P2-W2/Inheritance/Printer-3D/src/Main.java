import be.gilles.objects.Balk;
import be.gilles.objects.Bol;
import be.gilles.objects.Cilinder;
import be.gilles.objects.Kubus;

public class Main {

    public static void main(String[] args) {

        Bol hoofd = new Bol(0, 15, 0, 5);
        Cilinder lijf = new Cilinder(0, 0, 0, 5, 20);
        Balk arm1 = new Balk(-6, 0, 0, 2, 15, 2);
        Balk arm2 = new Balk(6, 0, 0, 2, 15, 2);
        Kubus voet1 = new Kubus(-3, -20, 0, 2);
        Kubus voet2 = new Kubus(3, -20, 0, 2);

        double volume = hoofd.volume();
        volume += lijf.volume();
        volume += arm1.volume();
        volume += arm2.volume();
        volume += voet1.volume();
        volume += voet2.volume();

        System.out.println(hoofd);
        System.out.println(lijf);
        System.out.println(arm1);
        System.out.println(arm2);
        System.out.println(voet1);
        System.out.println(voet2);

        System.out.println("\nHet totale volume is: " + volume);
    }

}
