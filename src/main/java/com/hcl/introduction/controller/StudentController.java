package com.hcl.introduction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.introduction.entity.Student;
import com.hcl.introduction.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/GetAllStudent")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	
	
}
