package com.enescidem.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enescidem.config.AppConfig;
import com.enescidem.model.User;
import com.enescidem.services.LoginService;
import com.enescidem.services.UserService;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = context.getBean(UserService.class);
		
		for (User user : userService.getUserList()) 	{
			System.out.println(user);
		}
		
		LoginService loginService = new LoginService();
		loginService.login();
		
	}

}
