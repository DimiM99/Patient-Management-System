package de.xu.bc.pms;

public class Patient 
{
	
	public String name;
	public String lastname;
	public String birthday;
	public String address;
	public int phonenumber;
	public int healthinsuranceID;
	public String healthinsuranceProvider;

	
	public Patient(String name, String lastname, String birthday, String address, int phonenumber, int healthinsuranceID, String healthinsuranceProvider) 
	{
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.address = address;
		this.phonenumber = phonenumber;
		this.healthinsuranceID = healthinsuranceID;
		this.healthinsuranceProvider = healthinsuranceProvider;
	}
	
	@Override
	public String toString() 
	{
		return String.format("name: %s %s\nbirthday: %s\naddress: %s\nphonenumber: %s\nhealthinsuranceID: %s\nhealthinsuranceProvider: %s",name, lastname, birthday, address, phonenumber, healthinsuranceID, healthinsuranceProvider);
	
	}
}

