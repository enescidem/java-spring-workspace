package com.enescidem.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enescidem.controller.IRestEmployeeController;
import com.enescidem.dto.DtoEmployee;
import com.enescidem.model.RootEntity;
import com.enescidem.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements IRestEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@Override
	@GetMapping("/list/{id}")
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}

}
