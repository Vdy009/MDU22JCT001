package com.elearning.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.elearning.models.Course;
import com.elearning.models.Orders;
import com.elearning.models.Service;
import com.elearning.models.User;
import com.elearning.services.CourseService;
import com.elearning.services.OrdersService;
import com.elearning.services.ServiceService;
import com.elearning.services.UserService;

@Controller
@SessionAttributes({"userid","uname","role"})
public class LearnerController {
	
	@Autowired UserService usrv;
	@Autowired HttpSession session;
	@Autowired ServiceService ssrv;
	@Autowired CourseService csrv;
	@Autowired OrdersService osrv;
	
	@GetMapping("/profile")
	public String profile(Model model) {
		String userid=session.getAttribute("userid").toString();
		model.addAttribute("user", usrv.findUser(userid));
		return "profile";
	}
	
	@PostMapping("/profile")
	public String updateprofile(User u,RedirectAttributes redirAttrs) {	
		u.setRole(session.getAttribute("role").toString());
		usrv.modifyUser(u);
		redirAttrs.addFlashAttribute("msg", "Profile updated successfully");
		return "redirect:/profile";
	}
	
	@GetMapping("/deactivate")
	public String deactivate(String userid,RedirectAttributes redirAttrs,SessionStatus status) {
		usrv.deactivate(userid);
		session.invalidate();
		status.setComplete();
		redirAttrs.addFlashAttribute("msg", "User deactivated");
		return "redirect:/";
	}
	
	@GetMapping("/allservices")
	public String allservices(Model model,String role) {
		if((role ==null || role.equals("all"))) {
			model.addAttribute("list", ssrv.allservices());}
		else if(!role.equals("all")) { 
			model.addAttribute("list", ssrv.userservices(role));}
	
		model.addAttribute("vendors", usrv.allUsers("Vendor"));
		return "allservices";
	}
	
	@GetMapping("/allcourses")
	public String allcourses(Model model,String role,String cat) {
		if((role ==null || role.equals("all")) && (cat == null || cat.equals("all")))
			model.addAttribute("list", csrv.allcourses());
		else if(!role.equals("all") && cat.equals("all")) 
			model.addAttribute("list", csrv.usercourses(role));
		else if(role.equals("all") && !cat.equals("all"))
			model.addAttribute("list", csrv.categorylist(cat));
		else if(!role.equals("all") && !cat.equals("all"))
			model.addAttribute("list", csrv.usercoursesanduser(role, cat));
		model.addAttribute("vendors", usrv.allUsers("Vendor"));
		return "allcourses";
	}
	
	@GetMapping("/buycourse")
	public String buycourse(int id,Model model) {
		Course c=csrv.findCourse(id);
		model.addAttribute("c", c);
		return "buycourse";
	}
	
	@PostMapping("/buycourse")
	public String buycourse(Orders o,RedirectAttributes redirAttrs) {
		osrv.saveOrder(o);
		redirAttrs.addFlashAttribute("msg", "Course purchase successfully");
		return "redirect:/history";
	}
	
	@GetMapping("/buyservice")
	public String buyservice(int id,Model model) {
		Service c=ssrv.findService(id);
		model.addAttribute("c", c);
		return "buyservice";
	}
	
	@PostMapping("/buyservice")
	public String buyservice(Orders o,RedirectAttributes redirAttrs) {
		osrv.saveOrder(o);
		redirAttrs.addFlashAttribute("msg", "Service purchase successfully");
		return "redirect:/history";
	}
	
	@GetMapping("/history")
	public String history(Model model) {
		String userid=session.getAttribute("userid").toString();
		List<Orders> courses=osrv.userOrders(userid, "Course");
		System.out.println(courses);
		model.addAttribute("clist",courses );
		model.addAttribute("slist", osrv.userOrders(userid, "Service"));
		return "history";
	}
}
