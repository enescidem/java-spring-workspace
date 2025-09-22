package com.enescidem.services;

import java.util.List;

import com.enescidem.dto.DtoEmployee;	

public interface IEmployeeService {
	public List<DtoEmployee> findAllEmployees();
}
