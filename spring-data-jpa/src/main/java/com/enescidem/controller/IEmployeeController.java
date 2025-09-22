package com.enescidem.controller;

import java.util.List;

import com.enescidem.dto.DtoEmployee;

public interface IEmployeeController {
	
	public List<DtoEmployee> findAllEmployees();
}
