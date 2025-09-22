package com.enescidem.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //expection handler olduğunu belli eden anatasyon
public class GlobalExceptionHandler {
	
	//Spring validation'dan fırlatılan hataları alıp yönetmek adam akıllı response dönmek
	
	private List<String> addMapValue(List<String> list, String newValue) {
		list.add(newValue);
		return list;
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)//exceptionu anatastonu yakaladı alttaki fonksiyondaki değişkene atadık
	//hataları en iyi yönetmek için map kullanmak daha mantıklı çünkü bir keyimiz oluyor ve onun içine liste ekleyebiliroyurz
	public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String, List<String>> errorsMap = new HashMap<>();
		for (ObjectError objError : ex.getBindingResult().getAllErrors()) {
			String fieldName = ((FieldError)objError).getField(); //tür dönüşümü yapıyoruz ve get field ile de hata fırlatılan değişken adını veren fonksiyondur
			if(errorsMap.containsKey(fieldName)) {//eğer gelen hata varolan hata keylerinin arasında varsa buraya gir
				errorsMap.put(fieldName, addMapValue(errorsMap.get(fieldName), objError.getDefaultMessage()));
			}else {	
				errorsMap.put(fieldName, addMapValue(new ArrayList<>(), objError.getDefaultMessage()));
			}
		}
		return ResponseEntity.badRequest().body(createApiError(errorsMap));
	}
	
	
	
	private <T> ApiError<T> createApiError(T errors) {//private <T> buradaki <T> fonksiyonun generic olduğunu belirtiyor sadece 
		ApiError<T> apiError = new ApiError<T>();
		apiError.setId(UUID.randomUUID().toString());
		apiError.setErrorTime(new Date());
		apiError.setErrors(errors);
		
		return apiError;
	}
		
}







