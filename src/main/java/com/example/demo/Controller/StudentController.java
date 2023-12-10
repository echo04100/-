package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StuDao;


@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
    private StuDao studao; // Assuming StudentImp is a service

	// 获取所有学生
    @GetMapping
    public List<StudentRepository> getAllStudents() {
        return studao.findAll();
    }

    // 插入学生
    @PostMapping
    public void insertStudent(@RequestBody StudentRepository student) {
        studao.save(student);
    }
}
