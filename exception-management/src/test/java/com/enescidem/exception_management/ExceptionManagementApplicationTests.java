package com.enescidem.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.enescidem.dto.DtoEmployee;
import com.enescidem.service.IEmployeeService;
import com.enescidem.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach //her test metoudundan önce çalıştır
	public void beforeEach() {
		System.out.println("beforeEach çalıştı...");
	}
	
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		assertNotNull(employee);//assertün bir sürü metodu var bunları deneyerek test edilebilir
	}
	
	
	@AfterEach //her test metoudundan sonra çalıştır
	public void afterEach() { 
		System.out.println("AfterEach çalıştı");
	}
}
