package de.xu.bc.pms;
import java.time.LocalDateTime;


public class Appointment
{
	private int appointmentID;
	private static int sequence = 0;
	
	public Patient patient;
	private LocalDateTime time;
	private String treatment;
	
	
	public Appointment(Patient patient, String treatment, int appointmentID) 
	{
		this.patient = patient;
		this.treatment = treatment;
		this.appointmentID=++sequence;
		this.time = LocalDateTime.now();
		
	}
	
	@Override
	public String toString() 
	{
		return String.format("name: %s %s\ntreatment: %s\nappointmentID: %s\ntime: %s",patient.getName(), patient.getLastname(), treatment, appointmentID, time.toString());
	
	}
}
