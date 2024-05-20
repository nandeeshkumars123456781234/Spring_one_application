package com.example.javatech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.javatech.dto.OrderResponse;
import com.example.javatech.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("SELECT new com.example.javatech.dto.OrderResponse(s.name , c.courseName) FROM Student s JOIN s.coursesList c")
	List<OrderResponse> getJoinInformation();

}
