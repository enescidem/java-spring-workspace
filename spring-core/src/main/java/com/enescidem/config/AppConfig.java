package com.enescidem.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enescidem.model.User;
import com.enescidem.services.UserService;

@Configuration
public class AppConfig {
	
	@Bean
	public UserService userService() {
		UserService userService = new UserService();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Enes"));
		userList.add(new User("Harun"));

		userService.setUserList(userList);
		
		return userService;
	}

}
