import be.gilles.Huisarts;
import be.gilles.Huisartsen;
import be.gilles.Patient;
import be.gilles.Patienten;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Patienten patienten = new Patienten();
        Huisartsen huisartsen = new Huisartsen();

        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        Patient patient = new Patient("Flor Wan");
        patient.setHuisartsId(0);
        patienten.insert(patient);
        patient = new Patient("Bart Matondo");
        patient.setHuisartsId(3);
        patienten.insert(patient);
        patient = new Patient("Elias Magnus");
        patient.setHuisartsId(2);
        patienten.insert(patient);
        patient = new Patient("Kevin Koch");
        patient.setHuisartsId(1);
        patienten.insert(patient);
        patient = new Patient("Lien Krasnovitski");
        patient.setHuisartsId(0);
        patienten.insert(patient);
        patient = new Patient("Kay Adib");
        patient.setHuisartsId(6);
        patienten.insert(patient);


        for (int i = 0; i < Patienten.volgendId; i++) {

            Patient patient1 = patienten.findbyId(i);

            if (!(patient1.getHuisartsId() < Huisartsen.volgendId)) {
                System.out.println("Patient " + patient1.getNaam() + " heeft geen geldige huisarts. Deze wordt verwijderd.");
                patienten.delete(patient1.getId());
            }

        }

        System.out.printf("%-9s| %-21S| %-20s%n%s%n", "ID", "NAAM", "HUISARTS", "-".repeat(52));

        for (int i = 0; i < Patienten.volgendId - 1; i++) {

            Patient patient1 = patienten.findbyId(i);
            Huisarts huisarts1 = huisartsen.findById(patient1.getHuisartsId());

            System.out.printf("%9s| %-21S| %-20s%n",
                    patient1.getId(), patient1.getNaam(), huisarts1.getNaam());

        }

        System.out.println();
        System.out.printf("%-9s | %-21S| %-20s%n%s%n", "ID", "NAAM", "HUISARTS", "-".repeat(52));

        Set<Patient> patientenVermeiren = patienten.findByHuisarts(0);
        for (Patient patient1 : patientenVermeiren) {

            Huisarts huisarts1 = huisartsen.findById(patient1.getHuisartsId());

            System.out.printf("%9s| %-21S| %-20s%n",
                    patient1.getId(), patient1.getNaam(), huisarts1.getNaam());

        }
    }
}
