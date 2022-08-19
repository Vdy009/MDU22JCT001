package data;

import java.util.List;

public class Student {
	
	private String name;
	private int grade;
	private String gender;
	private double gpa;
	
	
	public Student(String name, int grade, String gender, double gpa) {
		super();
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.gpa = gpa;
	}


	public Student(String string, int i, double d, String string2, int j, List<String> asList) {
		// TODO Auto-generated constructor stub
	}


	public Student(String string, int i, double d, String string2, List<String> asList) {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gender=" + gender + ", gpa=" + gpa + "]";
	}
	
	
	
	
	

}
