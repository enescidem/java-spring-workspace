package com.enescidem.service;

import com.enescidem.dto.DtoEmployee;

public interface IEmployeeService {

	public DtoEmployee findEmployeeById(Long id);
}
