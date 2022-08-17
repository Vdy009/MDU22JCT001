package com.StudentsMarksManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsMarksManagement.Entity.MarksInfo;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.RepoImpl.StudentRepoImpl;


@Controller
public class StudentController {
	
	@Autowired
	StudentRepoImpl sr;
	
	@GetMapping("studenthome")
	public String studentHome(Model m) {
		Student student = sr.getStudentByRoll();
		m.addAttribute("std", student);
		return "Student/Homepage";
	}
	
	@GetMapping("showstdmarks")
	public String showStudentMarks(Model m) {
		List<MarksInfo> marksinfo = sr.showMarksInfo();
		m.addAttribute("mlist", marksinfo);
		return "Student/MarksList";
	}
	
	@GetMapping("chstdpass")
	public String getChangePasswordPage(Model m) {
		return "Student/ChangePass";
	}
	
	@PostMapping("chstdpassprocess")
	public String changePass(@RequestParam String oldpass, @RequestParam String newpass, @RequestParam String conpass, Model m) {
		
		boolean r = sr.changePassword(oldpass, newpass, conpass);
		if(r) {
			m.addAttribute("msg", "Password Successfully Changed...");
			return "Student/ChangePass";
		}
		else {
			m.addAttribute("msg", "Error! Please Enter Correct Details...");
			return "Student/ChangePass";
		}
	
	}

}