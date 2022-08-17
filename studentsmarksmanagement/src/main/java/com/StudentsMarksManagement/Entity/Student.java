package com.StudentsMarksManagement.Entity;

/*CREATE TABLE STUDENTREG(ROLL_NO varchar(10),
STD_NAME varchar(30), GENDER varchar(6),
ADDRESS varchar(100), LOCATION varchar(20), 
PHONE INT, EMAIL varchar(50), 
PASSWORD varchar(20), CLASS_ID INT,
FOREIGN KEY (CLASS_ID) REFERENCES CLASS(CLASS_ID));*/

public class Student {
	private String rollNo;
	private String stdName;
	private String gender;
	private String address;
	private String location;
	private String phone;
	private String email;
	private String password;
	private int classId;
	
	public String getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public void setStdName(String stdName) {
		this.stdName = stdName;
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
	
	public int getClassId() {
		return classId;
	}
	
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public Student(String rollNo, String stdName, String gender, String address, String location, String phone,
			String email, String password, int classId) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.gender = gender;
		this.address = address;
		this.location = location;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.classId = classId;
	}
	
	public Student() {
		super();
	}

}
