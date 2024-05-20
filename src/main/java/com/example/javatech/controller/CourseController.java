package com.example.javatech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.javatech.entity.Courses;
import com.example.javatech.entity.Student;
import com.example.javatech.service.CourseService;
import com.example.javatech.service.StudentService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/createCourses")
	public Courses createCourses(@RequestBody Courses courses) {

		return courseService.createCourses(courses);
		
	}
	
	@PutMapping("/updateCourses/{courseId}")
	public Courses updateCourses(@RequestBody Courses courses, @PathVariable Long courseId) {

		return courseService.updateCourses(courses, courseId);
		
	}
	
	@GetMapping("/getCourses/{courseId}")
	public Optional<Courses> getCoursesById(@PathVariable Long courseId) {

		return courseService.getCoursesById(courseId);
		
	}
	
	@GetMapping("/getCourses")
	public List<Courses> getAllCourses() {

		return courseService.getAllCourses();
		
	}
}
