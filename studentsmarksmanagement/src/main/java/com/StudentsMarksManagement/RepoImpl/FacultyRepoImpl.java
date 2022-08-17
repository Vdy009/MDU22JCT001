package com.StudentsMarksManagement.RepoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.Repo.FacultyRepo;

@Component
public class FacultyRepoImpl implements FacultyRepo {

	@Autowired
	JdbcTemplate jt;
	
	private int classId;
	private String fId;

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
	
	@Override
	public Faculty getFacultyByFid () {
		String sql = "Select * from facultyinfo where fid = ?;"; 
		try {
			Faculty faculty = (Faculty) jt.queryForObject(sql, new Object[] {this.fId},new BeanPropertyRowMapper(Faculty.class));
			return faculty;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public ClassFaculty getMapFaculty() {
		String sql = "Select * from classfaculty where fId = ?;";
		try {
			ClassFaculty cf = (ClassFaculty) jt.queryForObject(sql, new Object[] {this.fId}, new BeanPropertyRowMapper(ClassFaculty.class));
			return cf;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	@Override
	public int getClassIdByRoll (String rollNo) {
        String sql = "Select class_id from studentreg where roll_no = ?;";
        return jt.queryForObject(sql, new Object[]{rollNo}, Integer.class);
    }

	@Override
	public List<Student> showAllClassStudents () {
		
		ClassFaculty cf = getMapFaculty();
		int cid = cf.getClassId();
		String sql = "Select * from studentreg where class_id = ?;";
		try {
			List<Student> studentAll = jt.query(sql,new Object[] {cid}, new BeanPropertyRowMapper(Student.class));
			return studentAll;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
		
	}

	@Override
	public boolean addMarks(String examType, int science, int maths, int computer, int total, int average, String grade,
			String rollNo, int classId, String fId) {
		
		int cid = getClassIdByRoll(rollNo);
		String sql = "Insert into marksinfo (examtype, science, maths, computer, total, average, grade, roll_no, class_id, fid) values(?,?,?,?,?,?,?,?,?,?);";
		try {	
			if(cid == classId) {
				int r = jt.update(sql, new Object[] {examType, science, maths, computer, total, average, grade, rollNo, classId, fId});
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
	public List<MarksInfo> showAllMarks() {
		ClassFaculty cf = getMapFaculty();
		int cid = cf.getClassId();
		String sql = "Select * from marksinfo where class_id = ?;";
		try {
			List<MarksInfo> marksinfo = jt.query(sql, new Object[] {cid}, new BeanPropertyRowMapper(MarksInfo.class));
			return marksinfo;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public boolean changePassword(String oldpass, String newpass, String conpass) {
		
		Faculty fac = getFacultyByFid();
		String sql = "Update facultyinfo set password = ? where fid = ?;";
		try {
			if(fac.getPassword().equals(oldpass) && newpass.equals(conpass)) {
				int r = jt.update(sql, newpass, fac.getfId());
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
