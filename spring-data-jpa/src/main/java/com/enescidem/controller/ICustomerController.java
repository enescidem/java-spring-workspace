package com.enescidem.controller;

import com.enescidem.dto.DtoCustomer;

public interface ICustomerController {
	
	public DtoCustomer findCustomerById(Long id);
}
