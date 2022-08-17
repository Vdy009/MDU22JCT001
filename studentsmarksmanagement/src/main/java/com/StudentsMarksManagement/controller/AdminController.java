package com.StudentsMarksManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentsMarksManagement.Entity.ClassFaculty;
import com.StudentsMarksManagement.Entity.ClassInfo;
import com.StudentsMarksManagement.Entity.Faculty;
import com.StudentsMarksManagement.Entity.Student;
import com.StudentsMarksManagement.RepoImpl.AdminRepoImpl;

@Controller
public class AdminController {
	
	@Autowired
	AdminRepoImpl ar;
	
	@GetMapping("adminhome")
	public String adminHome() {
		return "Admin/Homepage";
	}
	
	@GetMapping("classes")
	public String getClasses(Model m) {
		List<ClassInfo> classinfoAll = ar.showAllClasses();
		m.addAttribute("clist", classinfoAll);
		return "Admin/Classes";
	}
	
	@PostMapping("addclass")
	public String addNewClass(@RequestParam String classname, Model m) {
		boolean r = ar.addClass(classname);
		List<ClassInfo> classinfoAll = ar.showAllClasses();
		m.addAttribute("clist", classinfoAll);
		if(r) {
			m.addAttribute("msg", "Class added...");
			return "Admin/Classes";
		}
		else {
			m.addAttribute("msg", "Class not added!");
			return "Admin/Classes";
		} 
	}
	
	//student
	@GetMapping("studentreg")
	public String getStudentRegPage() {
		return "Admin/StudentReg";
	}
	
	@PostMapping("studentregprocess")
	public String addNewStudent(@RequestParam String rollno, @RequestParam String name, @RequestParam String gender, @RequestParam String address,
			@RequestParam String location, @RequestParam String phone, @RequestParam String classname, @RequestParam String password,
			@RequestParam String email, Model m) {

		ClassInfo clinfo = ar.getClass(classname);
		Student student = new Student(rollno, name, gender, address, location, phone, email, password, clinfo.getClassId());
		boolean r = ar.addStudent(student);
		if(r) {
			m.addAttribute("msg","Student Info Registered...");
			List<ClassInfo> classinfoAll=ar.showAllClasses();
			m.addAttribute("clist", classinfoAll); 
			return "Admin/StudentReg";
		}
		else {
			m.addAttribute("msg","Student Info Registration Failed!...");
			List<ClassInfo> classinfoAll=ar.showAllClasses();
			m.addAttribute("clist", classinfoAll); 
			return "Admin/StudentReg";
		}
	}
	
	@GetMapping("studentlist")
	public String getStudList(Model m) {
		List<Student> studentAll = ar.showAllStudents();
		m.addAttribute("slist", studentAll);
		return "Admin/StudentList";
	}
	
	//Faculty	
	@GetMapping("facultyreg")
	public String getFacultyRegPage() {
		return "Admin/FacultyReg";
	}
	
	@PostMapping("facultyregprocess")
	public String addNewFaculty(@RequestParam String fid, @RequestParam String name, @RequestParam String gender, @RequestParam String address,
			@RequestParam String location, @RequestParam String phone, @RequestParam String password, @RequestParam String email, Model m) {
		
		Faculty faculty = new Faculty(fid, name, gender, address, location, phone, email, password);
		boolean r = ar.addFaculty(faculty);
		if(r) {
			m.addAttribute("msg", "Faculty Info Registered...");
			return "Admin/FacultyReg";
		}
		else {
			m.addAttribute("msg", "Faculty Info Registration failed!...");
			return "Admin/FacultyReg";
		}
	}
	
	@GetMapping("facultylist")
	public String getFacList(Model m) {
		List<Faculty> facultyAll = ar.showAllFaculties();
		m.addAttribute("flist", facultyAll);
		return "Admin/FacultyList";
	}
	
	//Class-Faculty Map
	@GetMapping("cfmap")
	public String getClassFacMapPage(Model m) {
		
		List<Faculty> facultyAll = ar.showAllFaculties();
		List<ClassInfo> classinfoAll = ar.showAllClasses();
		m.addAttribute("clist", classinfoAll);
		m.addAttribute("flist", facultyAll);
		return "Admin/FacultyClassMap";
	}
	
	
	@PostMapping("cfmap")
	public String mappingProcess(@RequestParam int classId, @RequestParam String fId, Model m) {
		
		boolean flag = ar.addClassFacultyMap(classId, fId);
		if(flag) {
			m.addAttribute("msg", "Faculty Successfully Mapped...");
			List<Faculty> facultyAll = ar.showAllFaculties();
			List<ClassInfo> classinfoAll = ar.showAllClasses();
			m.addAttribute("clist", classinfoAll);
			m.addAttribute("flist", facultyAll);
			List<ClassFaculty> classfacultyAll = ar.showAllClassFacultyMap();
			m.addAttribute("cflist", classfacultyAll);
			return "Admin/FacultyClassMap";
		}
		else {
			m.addAttribute("msg","Class Already Mapped With A Faculty!...");
			List<Faculty> facultyAll = ar.showAllFaculties();
			List<ClassInfo> classinfoAll = ar.showAllClasses();
			m.addAttribute("clist", classinfoAll);
			m.addAttribute("flist", facultyAll);
			List<ClassFaculty> classfacultyAll = ar.showAllClassFacultyMap();
			m.addAttribute("cflist", classfacultyAll);
			return "Admin/FacultyClassMap";
		}
	}
	
	@GetMapping("cfmaps")
	public String getClassFacultyMaps(Model m) {
		List<Faculty> facultyAll = ar.showAllFaculties();
		List<ClassInfo> classinfoAll = ar.showAllClasses();
		m.addAttribute("clist", classinfoAll);
		m.addAttribute("flist", facultyAll);
		List<ClassFaculty> classfacultyAll = ar.showAllClassFacultyMap();
		m.addAttribute("cflist", classfacultyAll);
		return "Admin/FacultyClassMap";
	}
	
}
