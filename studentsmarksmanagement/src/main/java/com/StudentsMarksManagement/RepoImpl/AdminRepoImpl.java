package com.StudentsMarksManagement.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.ClassInfo;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.Repo.AdminRepo;

@Component
public class AdminRepoImpl implements AdminRepo {
	
	@Autowired
	JdbcTemplate jt;

	//Class Info
	@Override
	public boolean addClass(String className) {
		String sql = "Insert into class(class_name) values(?);";
		try
		{
			int r=jt.update(sql, new Object[] {className});
			if(r>=1) {
				return true;
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public List<ClassInfo> showAllClasses() {
		String sql = "Select * from class;";
		List<ClassInfo> classinfoAll = jt.query(sql, new BeanPropertyRowMapper(ClassInfo.class));
		return classinfoAll;
	}

	@Override
	public ClassInfo getClass(String className)
	{
		String sql = "Select * from class where class_name = ?;";
		try {
			ClassInfo clinfo = (ClassInfo) jt.queryForObject(sql, new Object[] {className}, new BeanPropertyRowMapper(ClassInfo.class));
			return clinfo;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	//Student Info
	@Override
	public boolean addStudent(Student student) {
		String sql = "Insert into studentreg(roll_no, std_name, gender, address, location, phone, email, password, class_id) values(?,?,?,?,?,?,?,?,?);";
		try
		{
			int r = jt.update(sql, new Object[] {student.getRollNo(), student.getStdName(), student.getGender(), student.getAddress(),
					student.getLocation(), student.getPhone(), student.getEmail(), student.getPassword(), student.getClassId()});
			if(r>=1) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public List<Student> showAllStudents() {
		String sql = "Select * from studentreg;";
		try {
			List<Student> studentAll = jt.query(sql, new BeanPropertyRowMapper(Student.class));
			return studentAll;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	//Faculty Info
	@Override
	public boolean addFaculty(Faculty faculty) {
		String sql = "Insert into facultyinfo(fId, fact_name, gender, address, location, phone, email, password) values(?,?,?,?,?,?,?,?);";
		try {
			int r = jt.update(sql, new Object[] {faculty.getfId(), faculty.getFactName(), faculty.getGender(), faculty.getAddress(), 
					faculty.getLocation(), faculty.getPhone(), faculty.getEmail(), faculty.getPassword()});
			if(r>=1) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public List<Faculty> showAllFaculties() {
		String sql = "Select * from facultyinfo;";
		try {
			List<Faculty> facultyAll = jt.query(sql, new BeanPropertyRowMapper(Faculty.class));
			return facultyAll;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public Faculty getFaculty(String factName)
	{
		String sql = "Select * from facultyinfo where fact_name = ?;";
		try
		{
			Faculty faculty = (Faculty) jt.queryForObject(sql, new Object[] {factName}, new BeanPropertyRowMapper(Faculty.class));
			return faculty;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	//Class-Faculty Map
	@Override
	public ClassFaculty getMapFaculty(String fId) {
		String sql = "Select * from classfaculty where fId = ?;";
		try {
			ClassFaculty cf = (ClassFaculty) jt.queryForObject(sql, new Object[] {fId}, new BeanPropertyRowMapper(ClassFaculty.class));
			return cf;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public ClassFaculty getMapClass(int classId) {
		String sql = "Select * from classfaculty where class_id = ?;";
		try {
			ClassFaculty cf = (ClassFaculty) jt.queryForObject(sql, new Object[] {classId}, new BeanPropertyRowMapper(ClassFaculty.class));
			return cf;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public boolean addClassFacultyMap(int classId, String fId) {
		//int flag = 1;
		String sql1 = "Insert into classfaculty(class_id, fId) values(?,?);";
		ClassFaculty cf1 = getMapClass(classId);
		ClassFaculty cf2 = getMapFaculty(fId);
		try {
			if(cf1 == null && cf2 == null) {
				int r = jt.update(sql1, new Object[] {classId ,fId});
				if(r>=1) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public List<ClassFaculty> showAllClassFacultyMap() {
		String sql = "Select * from classfaculty;";
		List<ClassFaculty> classfacultyAll = jt.query(sql, new BeanPropertyRowMapper(ClassFaculty.class));
		return classfacultyAll;
	}

}
