package com.demo.springcloud.config.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	
	@GetMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> getServiceInstanceList(@PathVariable String applicationName){
		
		return discoveryClient.getInstances(applicationName);
	}
	
}
