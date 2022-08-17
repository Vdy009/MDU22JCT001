package com.StudentsMarksManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.RepoImpl.FacultyRepoImpl;
import com.StudentsMarksManagement.RepoImpl.LoginRepoImpl;
import com.StudentsMarksManagement.RepoImpl.StudentRepoImpl;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepoImpl lr;
	
	@Autowired
	FacultyRepoImpl fr;
	
	@Autowired
	StudentRepoImpl sr;
	
	@GetMapping("/")
	public String home() {
		return "Login/Loginpage";
	}
	
	@GetMapping("login")
	public String login() {
		return "Login/Loginpage";
	}

	@PostMapping("login")
	public String Login(@RequestParam String username, @RequestParam String password, @RequestParam String usertype, Model m) {
		
		if(usertype.equals("admin")) {
			boolean res = lr.validateAdmin(username, password);
			if(res) {
				return "Admin/Homepage";
			}
			else {
				m.addAttribute("msg","Wrong Username / Password");
				return "Login/Loginpage";
			}
		}
		else if(usertype.equals("faculty")) {
			boolean res = lr.validateFaculty(username, password);
			if(res) {
				Faculty fac = lr.getFacultyByEmail(username);
				fr.setfId(fac.getfId());
				m.addAttribute("fac", fac);
				return "Faculty/Homepage";
			}
			else {
				m.addAttribute("msg","Wrong Username / Password");
				return "Login/Loginpage";
			}
			
		}
		else if(usertype.equals("student")) {
			boolean res = lr.validateStudent(username, password);
			if(res) {
				Student std = lr.getStudentByEmail(username);
				sr.setRollNo(std.getRollNo());
				m.addAttribute("std", std);
				return "Student/Homepage";
			}
			else {
				m.addAttribute("msg","Wrong Username / Password");
				return "Login/Loginpage";
			}
		}
		else {
			m.addAttribute("msg","Wrong Username / Password");
			return "Login/Loginpage";
		}
		
	}
	
}
