package com.StudentsMarksManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.RepoImpl.FacultyRepoImpl;

@Controller
public class FacultyController {
	
	@Autowired
	FacultyRepoImpl fr;
	
	@GetMapping("facultyhome")
	public String facultyHome(Model m) {
		Faculty faculty = fr.getFacultyByFid();
		m.addAttribute("fac", faculty);
		return "Faculty/Homepage";
	}
	
	@GetMapping("stdinfo")
	public String showAllStudentInfo(Model m) {
		List<Student> studentAll = fr.showAllClassStudents();
		m.addAttribute("slist", studentAll);
		return "Faculty/StudentList";
	}
	
	@GetMapping("addmarks")
	public String getAddMarksPage(Model m) {
		ClassFaculty classfaculty = fr.getMapFaculty();
		m.addAttribute("cf", classfaculty);
		return "Faculty/AddMarks";
	}

	@PostMapping("addmarksprocess")
	public String addMarks(@RequestParam String examType, @RequestParam String science, @RequestParam String maths,
			@RequestParam String computer, @RequestParam String rollNo, Model m) {
		
		int s = Integer.parseInt(science);
		int ma = Integer.parseInt(maths);
		int c = Integer.parseInt(computer);
		int tot = s+ma+c;
		int avg = tot / 3;
		String g;
		if(avg>=90) {
			g = "O";
		}
		else if(avg>=80 && avg<90) {
			g = "E";
		}
		else if(avg>=70 && avg<80) {
			g = "A";
		}
		else if(avg>=60 && avg<70) {
			g = "B";
		}
		else if(avg>=50 && avg<60) {
			g = "C";
		}
		else if(avg>=40 && avg<50) {
			g = "D";
		}
		else {
			g = "F";
		}
		ClassFaculty cf = fr.getMapFaculty();
		boolean r = fr.addMarks(examType, s, ma, c, tot, avg, g, rollNo, cf.getClassId(), cf.getfId());
		if(r) {
			ClassFaculty classfaculty = fr.getMapFaculty();
			m.addAttribute("cf", classfaculty);
			m.addAttribute("msg", "Marks successfully added...");
			return "Faculty/AddMarks";
		}
		else {
			ClassFaculty classfaculty = fr.getMapFaculty();
			m.addAttribute("cf", classfaculty);
			m.addAttribute("msg", "Error! Marks info not added...");
			return "Faculty/AddMarks";
		} 
		
	}
	
	@GetMapping("showmarks")
	public String showAllStudentMarks(Model m) {
		List<MarksInfo> marksAll = fr.showAllMarks();
		m.addAttribute("mlist", marksAll);
		return "Faculty/MarksList";
	}
	
	@GetMapping("chpass")
	public String getChangePasswordPage(Model m) {
		return "Faculty/ChangePass";
	}
	
	@PostMapping("chpassprocess")
	public String changePass(@RequestParam String oldpass, @RequestParam String newpass, @RequestParam String conpass, Model m) {
		
		boolean r = fr.changePassword(oldpass, newpass, conpass);
		if(r) {
			m.addAttribute("msg", "Password Successfully Changed...");
			return "Faculty/ChangePass";
		}
		else {
			m.addAttribute("msg", "Error! Please Enter Correct Details...");
			return "Faculty/ChangePass";
		}
		
	}
	
}
