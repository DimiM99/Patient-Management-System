package de.xu.bc.pms;

import java.util.List;
import java.util.ArrayList;

public class Storage 
{
    static private List<Patient> patients = new ArrayList<>();

    static void addPatients(Patient patient) 
    {
        patients.add(patient);
    }
    static void printPatients() 
    {
        
    	patients.forEach((patient) -> System.out.println("HealthID: " + patient.getHealthInsuranceID() + ", Name: " + patient.getName() + ", Lastname: " + patient.getLastname()));
    }

    static Patient selectPatientbyID(String input)
    {
       
    	Patient result = null;

        for(Patient patient: patients)
        {
        	
            if (input.equals(Integer.toString(patient.getHealthInsuranceID()))) 
            {
                result = patient;
            }
   
        }
        return result;
    }       
        
     static Patient selectPatientbyName(String input) 
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
    
}