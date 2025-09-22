package com.enescidem.services;

import com.enescidem.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);
}
