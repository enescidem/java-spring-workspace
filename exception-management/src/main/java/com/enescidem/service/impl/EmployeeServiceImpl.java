package com.enescidem.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enescidem.dto.DtoDepartment;
import com.enescidem.dto.DtoEmployee;
import com.enescidem.exception.BaseException;
import com.enescidem.exception.ErrorMessage;
import com.enescidem.exception.MessageType;
import com.enescidem.model.Department;
import com.enescidem.model.Employee;
import com.enescidem.repository.EmployeeRepository;
import com.enescidem.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if(optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		
		
		return dtoEmployee;
	}

}
