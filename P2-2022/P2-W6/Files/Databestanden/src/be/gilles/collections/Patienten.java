package be.gilles.collections;

import be.gilles.instances.Patient;
import be.gilles.interfaces.Persistent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Patienten implements Persistent {

    public static int volgendId = 0;
    private final Map<Integer, Patient> patientMap;

    public Patienten() {
        this.patientMap = new HashMap<>();
    }

    public void insert(Patient patient) {
        patient.setId(volgendId);
        patientMap.put(volgendId++, patient);
    }

    public boolean delete(int id) {

        if (patientMap.containsKey(id)) {
            patientMap.remove(id);
            return true;
        } else return false;
    }

    public Patient findbyId(int id) {
        return patientMap.get(id);
    }

    public Set<Patient> findByHuisarts(int id) {

        Set<Patient> result = new HashSet<>();

        for (Patient x : patientMap.values()) {
            if (x.getHuisartsId() == id) result.add(x);
        }

        return result;

    }

    @Override
    public String toString() {
        return patientMap.toString();
    }

    @Override
    public void bewaar(String filename) {

        try (Formatter formatter = new Formatter(filename)) {

            for (Patient patient : patientMap.values()) {
                formatter.format("%d;%s;%d\n", patient.getId(), patient.getNaam(), patient.getHuisartsId());
            }

        } catch (IOException e) {
            System.err.println("Incorrect path");
        }
    }

    @Override
    public void lees(String filename) {

        try (Scanner file = new Scanner(new File(filename))) {

            while (file.hasNext()) {

                String[] regelData = file.nextLine().split(";");
                int id = Integer.parseInt(regelData[0]);
                int doctorId = Integer.parseInt(regelData[2]);
                Patient patient = new Patient(regelData[1]);
                patient.setId(id);
                patient.setHuisartsId(doctorId);
                this.insert(patient);

            }

        } catch (FileNotFoundException e) {
            System.err.println("Incorrect path");
        }
    }
}


