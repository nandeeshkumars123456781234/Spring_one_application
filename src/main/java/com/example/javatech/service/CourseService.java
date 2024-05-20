package com.example.javatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javatech.entity.Courses;
import com.example.javatech.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Courses> getAllCourses() {

		return courseRepository.findAll();
	}

	public Optional<Courses> getCoursesById(Long courseId) {
		
		Optional<Courses> course = courseRepository.findById(courseId);
		if (course.isPresent()) {
			return course;
		} else {
			return null;
		}
	}

	public Courses createCourses(Courses courses) {
		
		return courseRepository.save(courses);
	}

	public Courses updateCourses(Courses courses, Long courseId) {

		Optional<Courses> Course = courseRepository.findById(courses.getCourseId());
		if (Course.isPresent()) {
			return courseRepository.save(courses);

		}
		return courses;
	}

}
