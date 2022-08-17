package com.StudentsMarksManagement.Repo;

import java.util.List;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;

public interface FacultyRepo {
	
	public Faculty getFacultyByFid();
	public int getClassIdByRoll(String rollNo);
	public ClassFaculty getMapFaculty();
	public List<Student> showAllClassStudents();
	
	public boolean addMarks(String examType, int science, int maths, int computer, int total, int average, String grade,
			String rollNo, int classId, String fId);
	public List<MarksInfo> showAllMarks();
	
	public boolean changePassword(String oldpass, String newpass, String conpass);
	

}
