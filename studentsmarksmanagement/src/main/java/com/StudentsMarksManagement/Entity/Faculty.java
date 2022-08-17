package com.StudentsMarksManagement.Entity;

/*CREATE TABLE FACULTYINFO(FID varchar(10),
FACT_NAME varchar(30), GENDER varchar(6),
ADDRESS varchar(100), LOCATION varchar(20), 
PHONE INT, EMAIL varchar(50), 
PASSWORD varchar(20));*/

public class Faculty {
	private String fId;
	private String factName;
	private String gender;
	private String address;
	private String location;
	private String phone;
	private String email;
	private String password;
	
	public String getfId() {
		return fId;
	}
	
	public void setfId(String fId) {
		this.fId = fId;
	}
	
	public String getFactName() {
		return factName;
	}
	
	public void setFactName(String factName) {
		this.factName = factName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Faculty(String fId, String factName, String gender, String address, String location, String phone,
			String email, String password) {
		super();
		this.fId = fId;
		this.factName = factName;
		this.gender = gender;
		this.address = address;
		this.location = location;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public Faculty()
	{
		super();
	}

}
