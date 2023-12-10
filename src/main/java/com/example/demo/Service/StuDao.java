package com.example.demo.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Repository.StudentRepository;

public interface StuDao extends JpaRepository<StudentRepository, Long>{
	

	

}
