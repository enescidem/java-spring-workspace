package com.enescidem.controller;

import java.util.List;

import com.enescidem.dto.DtoStudent;
import com.enescidem.dto.DtoStudentIU;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);

	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
