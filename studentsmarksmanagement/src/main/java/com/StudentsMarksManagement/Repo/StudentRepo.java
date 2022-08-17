package com.StudentsMarksManagement.Repo;

import java.util.List;

import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;

public interface StudentRepo {

	public Student getStudentByRoll();
	public List<MarksInfo> showMarksInfo();
	public boolean changePassword(String oldpass, String newpass, String conpass);
	
}
