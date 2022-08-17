package com.StudentsMarksManagement.Repo;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;

public interface LoginRepo {
	public boolean validateAdmin(String username, String password);
	public boolean validateFaculty(String username, String password);
	public boolean validateStudent(String username, String password);
	public Faculty getFacultyByEmail(String email);
	public ClassFaculty getClassFacultyByFid(String fId);
	public Faculty getFacultyByFid(String fId);
	public Student getStudentByEmail(String email);

}