package com.StudentsMarksManagement.Entity;

/*CREATE TABLE CLASS(CLASS_ID INT auto_increment PRIMARY KEY, 
CLASS_NAME VARCHAR(10));*/

public class ClassInfo {
	
	private int classId;
	private String className;
	
	public int getClassId() {
		return classId;
	}
	
	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public ClassInfo(int classId, String className) {
		
		super();
		this.classId = classId;
		this.className = className;
	}
	
	public ClassInfo() {
		super();
	}

}
