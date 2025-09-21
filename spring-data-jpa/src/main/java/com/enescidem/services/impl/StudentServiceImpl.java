package com.enescidem.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enescidem.dto.DtoStudent;
import com.enescidem.dto.DtoStudentIU;
import com.enescidem.entites.Student;
import com.enescidem.repository.StudentRepository;
import com.enescidem.services.IStudentService;
import com.enescidem.starter.SpringDataJpaApplication;

@Service
public class StudentServiceImpl implements IStudentService{

    private final SpringDataJpaApplication springDataJpaApplication;

	@Autowired
	private StudentRepository studentRepository;

    StudentServiceImpl(SpringDataJpaApplication springDataJpaApplication) {
        this.springDataJpaApplication = springDataJpaApplication;
    }
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent response= new DtoStudent();
		Student student = new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);//buradaki fonksiyon ilk değişkenin üstündeki değerleri ikinci değişkene kopyalamaya yarıyor
		
		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> dtoList = new ArrayList<>();
		
		List<Student> studentList = studentRepository.findAll();
		
		for (Student student : studentList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dto= new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()){//içi dolu mu sorgusu
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto;
	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional= studentRepository.findById(id);
		
		if(optional.isPresent()) {
			Student dbStudent = optional.get();
			
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			
			Student updatedStudent = studentRepository.save(dbStudent);
			
			BeanUtils.copyProperties(updatedStudent, dto);
			
			return dto;
		}
		return null;
	}
}
