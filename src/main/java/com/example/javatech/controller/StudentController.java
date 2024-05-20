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

import com.example.javatech.dto.OrderResponse;
import com.example.javatech.entity.Student;
import com.example.javatech.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/createStudents")
	public Student createStudents(@RequestBody Student student) {

		return studentService.createStudents(student);
		
	}
	
	@PutMapping("/updateStudents/{id}")
	public Student updateStudents(@RequestBody Student student, @PathVariable Long id) {

		return studentService.updateStudents(student, id);
		
	}
	
	@GetMapping("/getStudents/{id}")
	public Optional<Student> getStudentsById(@PathVariable Long id) {

		return studentService.getStudentsById(id);
		
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudents() {

		return studentService.getAllStudents();
		
	}
	
	@GetMapping("/getJoinInfo")
	public List<OrderResponse> getJoinInformation() {

		return studentService.getJoinInformation();
		
	}
}
