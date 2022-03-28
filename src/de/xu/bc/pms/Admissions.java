package de.xu.bc.pms;

import java.sql.Date;

public class Admissions
{
    String admissionID;
    Date registration;
    String patientID;

    public Admissions (String admissionID, Date registration, String patientID)
    {
        this.admissionID = admissionID;
        this.registration = registration;
        this.patientID = patientID;
    }

    public String getAdmissionID() {
        return admissionID;
    }

    public Date getStart() {
        return registration;
    }

    public String getPatientID() {
        return admissionID;
    }

    public String getData() {
        return(this.getAdmissionID() + this.getStart() + this.getPatientID());
    }
}