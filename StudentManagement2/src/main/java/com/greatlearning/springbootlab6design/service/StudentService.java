package com.greatlearning.springbootlab6design.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.springbootlab6design.entity.Student;




public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	

}
