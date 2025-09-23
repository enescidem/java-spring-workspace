package com.enescidem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enescidem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
