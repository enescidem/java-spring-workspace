package com.enescidem.controller;

import java.util.List;

import com.enescidem.entites.Student;

public interface IStudentController {
	
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();
	
}
