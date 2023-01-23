package be.gilles;

import java.util.*;

public class Patienten {

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
}


