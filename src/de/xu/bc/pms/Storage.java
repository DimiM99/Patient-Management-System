package de.xu.bc.pms;

import java.util.List;
import java.util.ArrayList;

public class Storage {
    private List<Patient> patients = new ArrayList<>();

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
    public void printPatients() {
        patients.forEach((patient) -> System.out.println("HealthID: " + patient.getHealthID() + ", Name: " + patient.getName() + ", Lastname: " + patient.getLastname()));
    }

    public Patient selectPatient(String input) {
        Patient result = null;
        for(Patient paitent: patients){
            if (input == Integer.toString(paitent.getHealthID())) {
                result = paitent;
            }
        }
        return result;
    }
}