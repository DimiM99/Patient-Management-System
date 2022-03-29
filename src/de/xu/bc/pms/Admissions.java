package de.xu.bc.pms;

import java.time.LocalDateTime;

public class Admissions
{
    final private String admissionID;
    final private LocalDateTime registration;
    final private String patientID;

    public Admissions (String admissionID, String patientID)
    {
        this.admissionID = admissionID;
        registration = LocalDateTime.now();
        this.patientID = patientID;
    }

    public String getAdmissionID() {
        return admissionID;
    }

    public LocalDateTime getStart() {
        return registration;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getData() {
        return(this.getAdmissionID() + ", " + this.getStart()+ ", " + this.getPatientID());
    }
}