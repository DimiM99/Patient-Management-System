package de.xu.bc.pms;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Visit implements Serializable
{
    final private int admissionID;
    final private LocalDateTime registration;
    final private String patientID;
    private LocalDateTime dischargeTime = null;
    private String SuspectedDiagnose;
    private String Diagnose = null;

    private static int sq = 0;

    public Visit(String patientID, String SuspectedDiagnose)
    {
        this.admissionID = ++sq;
        registration = LocalDateTime.now();
        this.patientID = patientID;
        this.SuspectedDiagnose = SuspectedDiagnose;
    }

    public int getAdmissionID() {
        return admissionID;
    }

    public void DischargePatien(String diagnose) {
        this.dischargeTime = LocalDateTime.now();
        this.Diagnose = diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.Diagnose = diagnose;
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