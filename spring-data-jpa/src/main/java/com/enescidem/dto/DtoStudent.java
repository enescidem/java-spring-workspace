package com.enescidem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {
	//entitydeki isimle aynı olmalı
	private String firstName;
	
	private String lastName;
}
