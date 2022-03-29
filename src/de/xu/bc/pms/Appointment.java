package de.xu.bc.pms;
import java.time.LocalDateTime;


public class Appointment
{
	final private int appointmentID;

	private static int sequence = 0;
	
	public Patient patient;

	final private LocalDateTime time;

	private String Symptoms;
	
	
	public Appointment(Patient patient, String Symptoms)
	{
		this.patient = patient;
		this.Symptoms = Symptoms;
		this.appointmentID=++sequence;
		this.time = LocalDateTime.now();
		
	}
	
	@Override
	public String toString() 
	{
		return String.format("name: %s %s\ntreatment: %s\nappointmentID: %s\ntime: %s",patient.getName(), patient.getLastname(), Symptoms, appointmentID, time.toString());
	
	}
}
