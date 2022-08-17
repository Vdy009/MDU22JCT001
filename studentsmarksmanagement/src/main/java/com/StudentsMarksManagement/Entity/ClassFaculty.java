package com.StudentsMarksManagement.Entity;

/*CREATE TABLE CLASSFACULTY(SNO INT auto_increment PRIMARY KEY,
CLASS_ID INT,
FID VARCHAR(10));*/

public class ClassFaculty {
	
	private int sNo;
	private int classId;
	private String fId;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
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
