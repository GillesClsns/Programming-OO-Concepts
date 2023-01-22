import be.gilles.Acteur;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Acteur[] testdata = {
            new Acteur("Cameron Diaz", 1972),
            new Acteur("Anna Faris", 1976),
            new Acteur("Angelina Jolie", 1975),
            new Acteur("Jennifer Lopez", 1970),
            new Acteur("Reese Witherspoon", 1976),
            new Acteur("Neve Campbell", 1973),
            new Acteur("Catherine Zeta-Jones", 1969),
            new Acteur("Kirsten Dunst", 1982),
            new Acteur("Kate Winslet", 1975),
            new Acteur("Gina Philips", 1975),
            new Acteur("Shannon Elisabeth", 1973),
            new Acteur("Carmen Electra", 1972),
            new Acteur("Drew Barrymore", 1975),
            new Acteur("Elisabeth Hurley", 1965),
            new Acteur("Tara Reid", 1975),
            new Acteur("Katie Holmes", 1978),
            new Acteur("Anna Faris", 1976)
    };

    public static void main(String[] args) {

        Acteur reese = new Acteur("Reese Witherspoon", 1976);
        Acteur drew = new Acteur("Drew Barrymore", 1975);
        Acteur anna = new Acteur("Anna Faris", 1976);
        Acteur thandie = new Acteur("Thandie Newton", 1972);

        List<Acteur> acteurs = new ArrayList<Acteur>();
        acteurs.addAll(Arrays.asList(testdata));
        acteurs.add(reese);
        acteurs.add(drew);
        acteurs.add(anna);
        acteurs.add(thandie);

        // Toon de inhoud van de collection (zonder iterator)
        Arrays.stream(testdata).forEach(System.out::println);

        // Verwijder de objecten reese en thandie
        acteurs.removeAll(Arrays.asList(reese, thandie));

        // Verwijder alle acteurs geboren in 1975 (met iterator)
        acteurs.removeIf(x -> x.getGeboortejaar() == 1975);

        // Using an iterator (the less efficient way :x)
        for (Iterator<Acteur> it = acteurs.iterator(); it.hasNext(); ) {
            if (it.next().getGeboortejaar() == 1975) it.remove();
        }

        // Verwijder alle dubbele acteurs in de lijst (doe dit bijvoorbeeld door een
        // nieuwe lijst te maken zonder dubbels.  Je kan “contains” gebruiken om te
        // kijken of een element al in de lijst zit.

        //acteurs = acteurs.stream().distinct().collect(Collectors.toList()); -> Updating
        // acteurs.stream().sorted(Acteur::compareTo).forEach(System.out::println);

        System.out.println("Uiteindelijke inhoud: ");
        acteurs.stream().distinct().sorted(Acteur::compareTo).forEach(System.out::println);

    }

}
