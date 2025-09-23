package com.enescidem.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enescidem.configuration.DataSource;
import com.enescidem.configuration.GlobalProperties;
import com.enescidem.configuration.Server;

//property kullanımı

@RestController
@RequestMapping("rest/api/property")
public class ProperySourceController {
	
	@Autowired
	private GlobalProperties globalProperties;
	
//	@GetMapping("/datasource")
//	public DataSource getDataSource() {
//		DataSource dataSource = new DataSource();
//		dataSource.setUrl(globalProperties.getUrl());
//		dataSource.setUsername(globalProperties.getUsername());
//		dataSource.setPassword(globalProperties.getPassword());
//		
//		
//		return dataSource;
//	}
	
	@GetMapping(value = "/getServers")
	public List<Server> getServers(){
		return globalProperties.getServers();
	}
}
