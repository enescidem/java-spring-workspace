package com.enescidem.dto;

import com.enescidem.model.Department;

import lombok.Data;

@Data
public class DtoEmployee {
	
	private Long id;
	
	private String name;

	private DtoDepartment department;
}
