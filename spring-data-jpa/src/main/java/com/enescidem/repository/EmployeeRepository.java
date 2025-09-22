package com.enescidem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enescidem.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
