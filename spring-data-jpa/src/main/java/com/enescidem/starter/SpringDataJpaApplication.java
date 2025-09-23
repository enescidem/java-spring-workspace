package com.enescidem.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.enescidem.configuration.GlobalProperties;

@EntityScan(basePackages = {"com.enescidem"})
@SpringBootApplication
@ComponentScan(basePackages = {"com.enescidem"})
@EnableJpaRepositories(basePackages = {"com.enescidem"})
// @PropertySource(value = "classpath:app.properties") //bu anatasyon application.propertiesin adı farklı olduğunda onu tanımlamak için kullanılır.
@EnableConfigurationProperties(value = GlobalProperties.class)//@ConfigurationProperties için gerekli
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
