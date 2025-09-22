package com.enescidem.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {//generic tipinde tanımladık
	private String id;
	
	private Date errorTime;
	
	private T errors; //ne gelirse  o tipte dön string gelirse string dön
}
