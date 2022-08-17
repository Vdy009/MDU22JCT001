package com.StudentsMarksManagement.RepoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.Repo.LoginRepo;

@Component
public class LoginRepoImpl implements LoginRepo {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public boolean validateAdmin(String username, String password) {
		if(username.equals("smmadmin")&&password.equals("smmadmin")) {
			return true;
		}
		else {
			return false;
		}

	}
	
	@Override
	public Faculty getFacultyByEmail (String email) {
		String sql = "Select * from facultyinfo where email = ?;";
		try {
			Faculty faculty = (Faculty) jt.queryForObject(sql, new Object[] {email},new BeanPropertyRowMapper(Faculty.class));
			return faculty;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public Faculty getFacultyByFid (String fId) {
		String sql = "Select * from facultyinfo where fid = ?;"; 
		try {
			Faculty faculty = (Faculty) jt.queryForObject(sql, new Object[] {fId},new BeanPropertyRowMapper(Faculty.class));
			return faculty;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public ClassFaculty getClassFacultyByFid (String fId) {
		String sql = "Select * from classfaculty where fid = ?;";
		try {
			ClassFaculty cf = (ClassFaculty) jt.queryForObject(sql, new Object[] {fId},new BeanPropertyRowMapper(ClassFaculty.class));
			return cf;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public boolean validateFaculty (String username, String password) {
		
		Faculty fac = this.getFacultyByEmail(username);
		if(fac == null) {
			return false;
		}
		else {
			if(fac.getPassword().equals(password)) {
				ClassFaculty cf = this.getClassFacultyByFid(fac.getfId());
				if(cf == null) {
					return false;
				}
				else {
					return true;
				}	
			}
			else {
				return false;
			}
				
		}
		
	}

	@Override
	public Student getStudentByEmail (String email) {
		String sql = "Select * from studentreg where email = ?;";
		try {
			Student student = (Student) jt.queryForObject(sql, new Object[] {email},new BeanPropertyRowMapper(Student.class));
			return student;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public boolean validateStudent(String username, String password) {
		
		Student student = getStudentByEmail(username);
		if(student == null) {
			return false;
		}
		else {
			if(student.getPassword().equals(password)) {
				return true;			
			}
			else {
				return false;
			}
				
		}

	}

}
