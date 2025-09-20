package com.enescidem.services;

import java.util.List;

import com.enescidem.entites.Student;

public interface IStudentService {
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
}

