/**
 * 
 */
package de.xu.bc.pms;

/**
 * @author mohammed
 *
 */
public class Starter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Let the system start ...");
		Patient somePatient = new Patient("Vakho","Tsagareli","27 May 1996","Marlene Dietrich Allee",666,777,"The Best Insurance");
		System.out.println(somePatient);
		Appointment someAppointment = new Appointment(somePatient, "28th Mar.", "Knee Surgery",123,1800);
		System.out.println(someAppointment);
	}

}
