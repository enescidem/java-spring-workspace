package com.enescidem.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enescidem.config.AppConfig;

public class LoginService {

	public void login() {
		// User list ihtiyacımız var.
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
	}
}
	