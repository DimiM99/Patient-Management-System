package de.xu.bc.pms;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.ArrayList;

public class Storage {

    private static List<Patient> patients = new ArrayList<>();
    private static List<Admissions> admissions = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();

    /**
     * managing Patients *
     */
    public static void addPatients(Patient patient) {
        patients.add(patient);
    }
    public static void printPatients() {
        patients.forEach((patient) -> System.out.println("HealthID: " + patient.getHealthID() + ", Name: " + patient.getName() + ", Lastname: " + patient.getLastname()));
    }
    public static Patient selectPatient(String input) {
        Patient result = null;
        for(Patient paitent: patients){
            if (input == Integer.toString(paitent.getHealthID())) {
                result = paitent;
            }
        }
        return result;
    }


    /**
     * managing Admissions *
     */
    public static void admitPatient(@NotNull Patient patient) {
        int temp = (int) Math.random();
        Admissions admit = new Admissions(Integer.toString(temp),Integer.toString(patient.getHealthID()));
        admissions.add(admit);
    }
    /**
     * discharging patients would mean deleting them from the list, but there
     * is a protocol that needs to be saved that has not jet have been implemented
    **/

    /**
     * Managing Appointmets
     */
    public static void createAnAppontentForPatient(Patient patient) {

    }

}