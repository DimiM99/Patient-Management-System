package de.xu.bc.pms;

public class Appointment
{
	public Patient patient;
	public String date;
	public String treatment;
	public int appointmentID;
	public int time;
	
	public Appointment(Patient patient, String date, String treatment, int appointmentID, int time) 
	{
		this.patient = patient;
		this.date = date;
		this.treatment = treatment;
		this.appointmentID = appointmentID;
		this.time = time;
	}
	
	@Override
	public String toString() 
	{
		return String.format("name: %s %s\ndate: %s\ntreatment: %s\nappointmentID: %s\ntime: %s",patient.name, patient.lastname, date, treatment, appointmentID, time);
	
	}
}
