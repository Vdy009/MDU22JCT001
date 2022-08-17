package com.elearning.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.Course;

import com.elearning.repos.CourseRepository;

@Service
public class CourseService {

	@Autowired CourseRepository repo;
	
	public void saveCourse(Course c) {
		repo.save(c);
	}
	
	public List<Course> allcourses(){
		return repo.findByActive(true);
	}
	
	public List<Course> usercourses(String userid){
		return repo.findByUserid(userid);
	}
	
	public List<Course> categorylist(String cat){
		return repo.findByCategory(cat);
	}
	
	public List<Course> usercoursesanduser(String userid,String cat){
		return repo.findByUseridAndCategory(userid,cat);
	}
	
	public Course findCourse(int id) {
		return repo.getById(id);
	}
	
	public void deactivate(int id) {
		Course c=findCourse(id);
		c.setActive(false);
		saveCourse(c);
	}
	
	public void activate(int id) {
		Course c=findCourse(id);
		c.setActive(true);
		saveCourse(c);
	}
	public void updateCourse(Course c) {
		System.out.println(c.getId());
		Course course=findCourse(c.getId());		
		course.setActive(c.isActive());
		course.setCname(c.getCname());
		course.setDuration(c.getDuration());
		course.setCategory(c.getCategory());
		course.setAmount(c.getAmount());
		course.setUserid(c.getUserid());
		System.out.println(course);
		repo.save(course);
	}
}
