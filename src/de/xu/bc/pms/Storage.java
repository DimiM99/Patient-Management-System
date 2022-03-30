package de.xu.bc.pms;


import java.io.*;
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

    public static Patient selectPatientbyName(String input)
    {
        Patient result = null;
        for(Patient patient: patients)
        {
            if (input.equals(patient.getName()))
            {
                result = patient;
            }
        }
        return result;
    }


    public static Patient selectPatientbyID(String input) {

        Patient result = null;

        for (Patient patient : patients) {

            if (input.equals(Integer.toString(patient.getHealthInsuranceID()))) {
                result = patient;
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

    public static void displayVisitData(Patient patient) {
        for (Visit visit : admissions) {
            if (visit.getPatientID() == visit.getPatientID()) {
                visit.getData();
            }
        }
    }


    /**
     * Managing Appointmets
     */
    public static void createAnAppontentForPatient(Patient patient, String reason) {
        Appointment appointment = new Appointment(patient, reason);
        appointments.add(appointment);
    }

    public static void cancelAppointment(Patient patient, String reason) {
        int i = appointments.indexOf(patient);
        appointments.get(i).cancelTheAppointment(reason);
    }

    public static void displayAppointmentData(Patient patient) {
        for (Appointment appointment : appointments) {
            if (appointment.patient == patient) {
                appointment.toString();
            }
        }
    }

    /**
     * Methods for preparing data for export
     */

    private static void WriteObjectToFile(Object serObj, String pathname) {
        try {
            FileOutputStream fileOut = new FileOutputStream(pathname);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void exportAppointments() {
        String pathname = "./Appointments.ser";
        WriteObjectToFile(appointments, pathname);
    }

    private static void exportVisits() {
        String pathname = "./Visits.ser";
        WriteObjectToFile(admissions, pathname);
    }

    private static void exportPatients() {
        String pathname = "./Patients.ser";
        WriteObjectToFile(patients, pathname);
    }

    public static void export() {
        exportPatients();
        exportVisits();
        exportAppointments();
    }


    private static void ReadFromBinFile(ArrayList<?> list, String pathname) {
        try {
            FileInputStream fis = new FileInputStream(pathname);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void readPatients() throws IOException, ClassNotFoundException {
        String pathname = "./Patients.ser";
        ReadFromBinFile((ArrayList<?>) patients, pathname);
    }

    private static void readVisits() throws IOException, ClassNotFoundException {
        String pathname = "./Visits.ser";
        ReadFromBinFile((ArrayList<?>) admissions, pathname);
    }

    private static void readApointments() throws IOException, ClassNotFoundException {
        String pathname = "./Appointments.ser";
        ReadFromBinFile((ArrayList<?>) appointments, pathname);
    }

    public static void read() {
        try {
            readPatients();
            readVisits();
            readApointments();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}