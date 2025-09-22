package com.enescidem.services;

import com.enescidem.dto.DtoAddress;

public interface IAddressService {
	
	public DtoAddress findAddressById(Long id);
}
