package com.example.javatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javatech.dto.OrderResponse;
import com.example.javatech.entity.Student;
import com.example.javatech.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudents(Student student) {

		return studentRepository.save(student);
	}

	public Student updateStudents(Student student, Long id) {

		Optional<Student> students = studentRepository.findById(student.getId());
		if (students.isPresent()) {
			return studentRepository.save(student);

		}
		return student;
	}

	public Optional<Student> getStudentsById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		if (student.isPresent()) {
			return student;
		} else {
			return null;
		}
	}

	public List<Student> getAllStudents() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

	public List<OrderResponse> getJoinInformation() {
		
		return studentRepository.getJoinInformation();
	}

}
