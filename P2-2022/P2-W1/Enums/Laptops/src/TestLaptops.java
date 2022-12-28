import be.gilles.Laptop;
import be.gilles.Laptops;

import static be.gilles.enums.CpuGeneration.*;
import static be.gilles.enums.Merk.*;
import static be.gilles.enums.CpuType.*;

public class TestLaptops {

    public static void main(String[] args) {

        Laptops laptops = new Laptops();
        laptops.voegToe(new Laptop("Kris", IVY_BRIDGE, I7, 16, 256, APPLE));
        laptops.voegToe(new Laptop("Paulien", HASWELL, I3, 8, 128, TOSHIBA));
        laptops.voegToe(new Laptop("Kay", BROADWELL, I5, 16, 512, ACER));
        laptops.voegToe(new Laptop("Divine", KABYLAKE, I5, 32, 1024, DELL));
        laptops.voegToe(new Laptop("Mohamed", KABYLAKE, null, 16, 512, null));

        laptops.printInventory();

    }

}
