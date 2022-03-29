package de.xu.bc.pms;

import java.util.List;
import java.util.ArrayList;

public class Storage {
    private List<Patient> patients = new ArrayList<>();

    void addPatients(Patient patient) {
        patients.add(patient);
    }
    void printPatients() {
        patients.forEach((patient) -> System.out.println("HealthID: " + patient.healthinsuranceID + ", Name: " + patient.name + ", Lastname: " + patient.lastname));
    }

    Patient selectPatient(String input) {
        Patient result = null;
        for(Patient paitent: patients){
            if (input == Integer.toString(paitent.healthinsuranceID)) {
                result = paitent;
            }
        }
        return result;
    }
}