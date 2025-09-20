package com.enescidem.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enescidem.controller.IStudentController;
import com.enescidem.entites.Student;
import com.enescidem.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{
	
	@Autowired
	private IStudentService studentService;
	// DTO kullanılır normalde
	
	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
		
	}
	
	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
}
