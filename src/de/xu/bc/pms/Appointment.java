package de.xu.bc.pms;
import java.io.Serializable;
import java.time.LocalDateTime;


public class Appointment implements Serializable
{
	final private int appointmentID;

	private static int sequence = 0;
	
	public Patient patient;

	final private LocalDateTime time;

	private String Symptoms;

	private boolean isTakingPlace = true;
	private String ReasonForCancelation = "";
	
	
	public Appointment(Patient patient, String Symptoms)
	{
		this.patient = patient;
		this.Symptoms = Symptoms;
		this.appointmentID=++sequence;
		this.time = LocalDateTime.now();
		
	}

	public void cancelTheAppointment(String reasonForCancelation) {
		this.isTakingPlace = false;
		this.ReasonForCancelation = reasonForCancelation;
	}


	public int getAppointmentID() {
		return appointmentID;
	}

	@Override
	public String toString() 
	{
		return String.format("name: %s %s\ntreatment: %s\nappointmentID: %s\ntime: %s",patient.getName(), patient.getLastname(), Symptoms, appointmentID, time.toString(), isTakingPlace, ReasonForCancelation);
	
	}
}
