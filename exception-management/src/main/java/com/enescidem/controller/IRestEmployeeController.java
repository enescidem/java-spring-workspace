package com.enescidem.controller;

import com.enescidem.dto.DtoEmployee;
import com.enescidem.model.RootEntity;

public interface IRestEmployeeController {
	
	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
