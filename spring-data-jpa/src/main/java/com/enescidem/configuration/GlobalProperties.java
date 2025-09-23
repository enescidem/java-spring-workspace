package com.enescidem.configuration;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


/*
import org.springframework.beans.factory.annotation.Value;

//application.properties dosyasından herhangi bir veriyi almanın yönetimi
@Data
@Component
public class GlobalProperties {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
}
*/

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class GlobalProperties {
	
	private List<Server> servers;
	
}
	