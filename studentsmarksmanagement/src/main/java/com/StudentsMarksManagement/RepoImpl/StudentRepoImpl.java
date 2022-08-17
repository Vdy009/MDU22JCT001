package com.StudentsMarksManagement.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.Repo.StudentRepo;

@Component
public class StudentRepoImpl implements StudentRepo{
	
	@Autowired
	JdbcTemplate jt;
	
	private String rollNo;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public Student getStudentByRoll() {
		String sql = "Select * from studentreg where roll_no = ?;"; 
		try {
			Student std = (Student) jt.queryForObject(sql, new Object[] {this.rollNo},new BeanPropertyRowMapper(Student.class));
			return std;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public List<MarksInfo> showMarksInfo() {
		
		String sql = "Select * from marksinfo where roll_no = ?;";
		try {
			List<MarksInfo> marksinfo = jt.query(sql, new Object[] {this.rollNo}, new BeanPropertyRowMapper(MarksInfo.class));
			return marksinfo;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public boolean changePassword(String oldpass, String newpass, String conpass) {
		
		Student std = getStudentByRoll();
		String sql = "Update studentreg set password = ? where roll_no = ?;";
		try {
			if(std.getPassword().equals(oldpass) && newpass.equals(conpass)) {
				int r = jt.update(sql, newpass, std.getRollNo());
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

}
