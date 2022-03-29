/**
 * 
 */
package de.xu.bc.pms;
import java.time.LocalDateTime;
import java.util.*;
/**
 * @author mohammed
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Let the system start ...");
		//Patient somePatient = new Patient("Vakho","Tsagareli","27 May 1996","Marlene Dietrich Allee",666,777,"The Best Insurance");
		//System.out.println(somePatient);
		//Appointment someAppointment = new Appointment(somePatient, "28th Mar.", 123);
		//System.out.println(someAppointment);
		showMenu();
	}
	
	private static void showMenu() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Select An Option: ");
		System.out.println("1: Create Patient");
		System.out.println("2: Create Appointment");
		int input = s.nextInt();
		switch (input) 
		{
		case 1: 
			System.out.println(createPatient());
			break;
		case 2:
			System.out.println(createAppointment());
			break;
		default:
			System.out.println("InvalidInput");
		}
	}
	private static Patient createPatient() 
	{
		Scanner s = new Scanner(System.in);
		 String name;
		 String lastname;
		 String birthday;
		 String address;
		 int phonenumber;
		 int healthinsuranceID;
		 String healthinsuranceProvider;
		 
		 System.out.print("Name: ");
		 name = s.nextLine();
		 
		 System.out.print("Lastname: ");
		 lastname = s.nextLine();
		 
		 System.out.print("Birthday: ");
		 birthday = s.nextLine();
		 
		 System.out.print("Address:");
		 address = s.nextLine();
		 
		 System.out.print("Phone Number: ");
		 phonenumber = s.nextInt();
		 
		 System.out.print("Health Insurance ID: ");
		 healthinsuranceID = s.nextInt();
		 s.nextLine();
		 System.out.print("Health Insurance Provider: ");
		 healthinsuranceProvider = s.nextLine();
		 
		 
		 Patient patient = new Patient(name, lastname, birthday, address, phonenumber, healthinsuranceID, healthinsuranceProvider);
 
		 return patient;
	}
	
	private static Appointment createAppointment() {
		
		Scanner s = new Scanner(System.in);
		
		Patient patient = new Patient("John", "Doe", "01.01.2000","Marlene-Dietrich-Allee", 123456879, 9876543, "BKK");
		
		//public Patient patient;
		//private LocalDateTime time;
		  String treatment;
		
		System.out.print("Treatment: ");
		treatment = s.nextLine();
		
		Appointment appointment = new Appointment(patient, treatment);
		
		return appointment;
	}
	
}
