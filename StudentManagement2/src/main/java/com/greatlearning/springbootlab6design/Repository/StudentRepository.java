package com.greatlearning.springbootlab6design.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.springbootlab6design.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {

}
