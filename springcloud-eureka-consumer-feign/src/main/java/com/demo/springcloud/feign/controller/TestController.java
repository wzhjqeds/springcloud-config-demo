package com.demo.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springcloud.feign.service.EurekaFeignService;

@RestController
public class TestController {
	
	
	@Autowired
	private EurekaFeignService eurekaFeignService;
	
	@GetMapping("feignGet")
	public String get() {
		return eurekaFeignService.getInfo();
	}

}
