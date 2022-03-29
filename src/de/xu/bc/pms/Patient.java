package de.xu.bc.pms;

public class Patient 
{
	
	private String name;
	private String lastname;
	private String birthday;
	private String address;
	private int phonenumber;
	private int healthinsuranceID;
	private String healthinsuranceProvider;

	
	public Patient(String name, String lastname, String birthday, String address, int phonenumber, int healthinsuranceID, String healthinsuranceProvider) 
	{
		this.setName(name);
		this.setLastname(lastname);
		this.birthday = birthday;
		this.address = address;
		this.phonenumber = phonenumber;
		this.healthinsuranceID = healthinsuranceID;
		this.healthinsuranceProvider = healthinsuranceProvider;
	}
	
	@Override
	public String toString() 
	{
		return String.format("name: %s %s\nbirthday: %s\naddress: %s\nphonenumber: %s\nhealthinsuranceID: %s\nhealthinsuranceProvider: %s",getName(), getLastname(), birthday, address, phonenumber, healthinsuranceID, healthinsuranceProvider);
	
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getHealthInsuranceID() 
	{
		return healthinsuranceID;
	}
}

