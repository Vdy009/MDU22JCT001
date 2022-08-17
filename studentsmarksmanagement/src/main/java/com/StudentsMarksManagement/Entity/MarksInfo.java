package com.StudentsMarksManagement.Entity;

/*CREATE TABLE MARKSINFO(SNO INT auto_increment PRIMARY KEY,
EXAMTYPE varchar(10), SCIENCE INT, MATHS INT, COMPUTER INT,
TOTAL INT, AVERAGE DECIMAL(2,2), GRADE varchar(1),
ROLL_NO varchar(10), CLASS_ID INT, FID VARCHAR(10));
*/
public class MarksInfo {
	
	private int sNo;
	private String examType;
	private int science;
	private int maths;
	private int computer;
	private int total;
	private int average;
	private char grade;
	private String rollNo;
	private int classId;
	private String fId;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

}