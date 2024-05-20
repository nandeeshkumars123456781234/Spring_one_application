package com.example.javatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javatech.entity.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
