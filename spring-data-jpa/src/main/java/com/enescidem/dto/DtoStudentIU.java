package com.enescidem.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "Firstname is not empty!")
	@Min(value = 3,message = "firstname must be higher 3 charachter")
	@Max(value = 10,message = "firstname must be lower 10 charachter")
	private String firstName;	
	
	@Size(min = 3, max = 30)
	private String lastName;
	
	private Date birthOfDate;
	
	@Email(message = "Email format is not true")
	private String email;
	
	@Size(min = 11, max = 11, message = "tckn must be 11 charachter")
	@NotEmpty(message = "tckn is not empty")
	private String tckn;
	
}
