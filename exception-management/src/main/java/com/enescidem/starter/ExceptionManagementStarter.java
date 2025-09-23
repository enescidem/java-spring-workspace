package com.enescidem.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EntityScan(basePackages = {"com.enescidem"})//entityleri scan edip başlatabilmesi için
@EnableJpaRepositories(basePackages = {"com.enescidem"})//repository enable ediyoruz burada da
@ComponentScan(basePackages = {"com.enescidem"})//componentleri de bunla enable ediyoruz
@SpringBootApplication
@EnableScheduling
public class ExceptionManagementStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementStarter.class, args);
	}

}
