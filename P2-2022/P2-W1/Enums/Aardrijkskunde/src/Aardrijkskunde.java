import be.gilles.Continent;

import java.util.Arrays;

public class Aardrijkskunde {

    public static void main(String[] args) {

        Arrays.stream(Continent.values()).forEach(System.out::println);

    }

}
