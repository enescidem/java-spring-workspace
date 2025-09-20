package com.enescidem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enescidem.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{//kulancağımız sinif , siniftaki primary key değişkeni
	
}
