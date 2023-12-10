package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hibernate.query.NativeQuery;
import com.example.demo.Repository.StudentRepository;


/***
 * 繼承 Student 的interface
 */
@Service
public class StudentImp {

	@Autowired 
	private StuDao studao;

	public List<StudentRepository> getAllstudents() {
		// TODO Auto-generated method stub
		return studao.findAll();
	}


	public void insertstudent(StudentRepository std) {
		// TODO Auto-generated method stub
		studao.save(std);
	}
	
	


}

