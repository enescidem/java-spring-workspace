package com.enescidem.controller;

import com.enescidem.dto.DtoEmployee;

public interface IRestEmployeeController {
	
	public DtoEmployee findEmployeeById(Long id);
}
