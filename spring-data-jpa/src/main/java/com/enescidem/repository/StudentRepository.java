package com.enescidem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.enescidem.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{//kulancağımız sinif , siniftaki primary key değişkeni
	//Buraya kendi özel metotlarımızı yazabiliriz.
	
	// HQL : sınıfın ismi ve değişken isimleri kullanılarak sorgular nativeQuery = false dur
	// SQL : db tablo ismi ve table içerisindeki column isimleir ile sorrgular yazılır.nativeQuery = true dur
	@Query(value = "select * from student.student", nativeQuery = true)
	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id= :studentId")
	Optional<Student> findStudentById(Integer studentId);
}
