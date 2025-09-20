package com.enescidem.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enescidem.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){	
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "Enes", "Çidem"));
		employeeList.add(new Employee("2", "Berat", "Bilgiç"));
		employeeList.add(new Employee("3", "Akın", "Acar"));
		employeeList.add(new Employee("4", "Ahmet", "Şenel"));
		employeeList.add(new Employee("5", "Semih", "Bagatır"));
		employeeList.add(new Employee("6", "Enes", "Can"));
		employeeList.add(new Employee("7", "Samed", "Çidem"));
		
		return employeeList;
	}
}
