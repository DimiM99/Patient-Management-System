package de.xu.bc.pms;


import java.util.List;
import java.util.ArrayList;

public class Storage {

    private static List<Patient> patients = new ArrayList<>();
    private static List<Visit> admissions = new ArrayList<>();
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
    public static void admitPatient(Patient patient, String reason) {
        Visit admit = new Visit(Integer.toString(patient.getHealthID()), reason);
        admissions.add(admit);
    }
    public static void dischargePatien(Patient patient, String diagnose) {
        int i = admissions.indexOf(patient);
        admissions.get(i).DischargePatien(diagnose);
    }

    /**
     * Managing Appointmets
     */
    public static void createAnAppontentForPatient(Patient patient, String reason) {
        Appointment appointment = new Appointment(patient, reason);
        appointments.add(appointment);
    }

}