package com.enescidem.services;

import com.enescidem.dto.DtoHome;

public interface IHomeService {
	
	public DtoHome findHomeById(Long id);
}
