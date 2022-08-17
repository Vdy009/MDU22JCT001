package com.StudentsMarksManagement.Repo;

import java.util.List;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.ClassInfo;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;

public interface AdminRepo {
	
	public boolean addClass(String className);
	public List<ClassInfo> showAllClasses();
	public ClassInfo getClass(String className);
	
	public boolean addStudent(Student student);
	public List<Student> showAllStudents();
	
	public boolean addFaculty(Faculty faculty);
	public List<Faculty> showAllFaculties();
	public Faculty getFaculty(String factName);
	
	public boolean addClassFacultyMap(int classID, String fID);
	public List<ClassFaculty> showAllClassFacultyMap();
	public ClassFaculty getMapFaculty(String fId);
	public ClassFaculty getMapClass(int classId);
}
