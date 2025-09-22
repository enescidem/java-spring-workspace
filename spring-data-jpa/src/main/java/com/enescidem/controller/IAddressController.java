package com.enescidem.controller;

import com.enescidem.dto.DtoAddress;

public interface IAddressController {
	
	public DtoAddress findAddressById(Long id);
}
