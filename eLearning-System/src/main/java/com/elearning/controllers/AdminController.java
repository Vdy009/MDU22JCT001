package com.elearning.controllers;


import java.time.LocalDate;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.elearning.models.Course;
import com.elearning.models.Service;
import com.elearning.models.User;
import com.elearning.services.CourseService;
import com.elearning.services.ServiceService;
import com.elearning.services.UserService;

@Controller
@SessionAttributes({"userid","uname","role"})
public class AdminController {
	
	@Autowired UserService usrv;
	@Autowired ServiceService ssrv;
	@Autowired CourseService csrv;
	@Autowired HttpSession session;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/validate")
	public String validate(String userid,String pwd,String role,RedirectAttributes redirAttrs) {
		User u=usrv.validateUser(userid, pwd);
		System.out.println(u);
		if(u==null) {
			redirAttrs.addFlashAttribute("error", "Incorrect username or password");
			return "redirect:/";
		}
		if(!u.getActive()) {
			redirAttrs.addFlashAttribute("error", "User is not active. Contact Administrator");
			return "redirect:/";
		}
		else if(role.equals(u.getRole())) {			
			session.setAttribute("userid", u.getUserid());
			session.setAttribute("uname", u.getName());
			session.setAttribute("role", u.getRole());
			System.out.println("Login"+u);
			if(role.equals("Admin"))
				return "redirect:/dashboard";
			else if(role.equals("Learner"))
				return "redirect:/profile";
			else
				return "redirect:/profile";
		}
		else {
			redirAttrs.addFlashAttribute("error", "Incorrect role selected");
			return "redirect:/";
		}
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "adashboard";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@Valid User u,BindingResult br,Model model,RedirectAttributes redirAttrs) {
		boolean valid=true;
		if(br.hasErrors()) {
			valid=false;
		}		
		if(!u.getCpwd().equals(u.getPwd())) {
			br.rejectValue("cpwd","error.cpwd","Password doesn't match");
			valid=false;
		}
		if(u.getDob().length()>0) {
			LocalDate dt=LocalDate.parse(u.getDob());
			LocalDate today=LocalDate.now();
			if((today.getYear()-dt.getYear())<18) {
				br.rejectValue("dob","error.dob","Age must be greater than 18");
				valid=false;
			}
		}
		if(!valid) {
			model.addAttribute("user", u);
			return "register";
		}
		else {
			usrv.addUser(u);
			redirAttrs.addFlashAttribute("msg", "User created successfully");
			return "redirect:/";
		}
	}
	
	@GetMapping("/users")
	public String allUsers(String role,Model model) {
		
		if(role==null || role.equals("all"))
			model.addAttribute("users", usrv.allUsers());
		else
			model.addAttribute("users", usrv.allUsers(role));
		return "users";
	}
	
	@GetMapping("/adduser")
	public String adduser(Model model) {
		model.addAttribute("user", new User());
		return "adduser";
	}
	
	@PostMapping("/adduser")
	public String saveuser(@Valid User u,BindingResult br,Model model,RedirectAttributes redirAttrs) {
		boolean valid=true;
		if(br.hasErrors()) {
			valid=false;
		}		
		if(!u.getCpwd().equals(u.getPwd())) {
			br.rejectValue("cpwd","error.cpwd","Password doesn't match");
			valid=false;
		}
		if(u.getDob().length()>0) {
			LocalDate dt=LocalDate.parse(u.getDob());
			LocalDate today=LocalDate.now();
			if((today.getYear()-dt.getYear())<18) {
				br.rejectValue("dob","error.dob","Age must be greater than 18");
				valid=false;
			}
		}
		if(!valid) {
			model.addAttribute("user", u);
			return "adduser";
		}
		else {
			usrv.addUser(u);
			redirAttrs.addFlashAttribute("msg", "User created successfully");
			return "redirect:/users";
		}
	}
	
	@GetMapping("/edituser")
	public String edituser(String id,Model model) {
		User user=usrv.findUser(id);
		model.addAttribute("user", user);
		return "edituser";
	}
	
	@PostMapping("/edituser")
	public String updateuser(User u,RedirectAttributes redirAttrs) {		
		usrv.updateUser(u);
		redirAttrs.addFlashAttribute("msg", "User updated successfully");
		return "redirect:/users";
	}
	
	@GetMapping("/aservices")
	public String listallservices(Model model,String role) {
		if((role ==null || role.equals("all"))) {
			model.addAttribute("list", ssrv.allservices());}
		else if(!role.equals("all")) { 
			model.addAttribute("list", ssrv.userservices(role));}
	
		model.addAttribute("vendors", usrv.allUsers("Vendor"));
		return "aallservices";
	}
	
	@GetMapping("/acourses")
	public String listallcourses(Model model,String role,String cat) {
		if((role ==null || role.equals("all")) && (cat == null || cat.equals("all")))
			model.addAttribute("list", csrv.allcourses());
		else if(!role.equals("all") && cat.equals("all")) 
			model.addAttribute("list", csrv.usercourses(role));
		else if(role.equals("all") && !cat.equals("all"))
			model.addAttribute("list", csrv.categorylist(cat));
		else if(!role.equals("all") && !cat.equals("all"))
			model.addAttribute("list", csrv.usercoursesanduser(role, cat));
		model.addAttribute("vendors", usrv.allUsers("Vendor"));
		return "aallcourses";
	}
	
	@GetMapping("/adservice")
	public String addservice() {
		return "aaddservice";
	}
	
	@PostMapping("/adservice")
	public String saveservice(Service srv,RedirectAttributes redirAttrs) {
		ssrv.saveService(srv);
		redirAttrs.addFlashAttribute("msg", "Service created successfully");
		return "redirect:/aservices";
	}
	
	@GetMapping("/adcourse")
	public String addcourse() {
		return "aaddcourse";
	}
	
	@PostMapping("/adcourse")
	public String savecourse(Course c,RedirectAttributes redirAttrs) {
		csrv.saveCourse(c);
		redirAttrs.addFlashAttribute("msg", "Course created successfully");
		return "redirect:/acourses";
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		session.invalidate();
		status.setComplete();
		return "redirect:/";
		
	}
	
    }
	
	

