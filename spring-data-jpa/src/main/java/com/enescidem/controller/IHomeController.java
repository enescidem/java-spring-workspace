package com.enescidem.controller;

import com.enescidem.dto.DtoHome;

public interface IHomeController {
	public DtoHome findHomeById(Long id);
}
