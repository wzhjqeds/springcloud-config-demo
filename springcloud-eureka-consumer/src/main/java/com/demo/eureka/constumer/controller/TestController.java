package com.demo.eureka.constumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("test")
	public String get() {
		return restTemplate.getForObject("http://eureka-producer/gettest", String.class);
	}

	@RequestMapping("/ribbonInfo")
	public String ribbonInfo() {
		System.out.println("调用 服务 EUREKA-CLIENT/info");
		String message = restTemplate.getForObject("http://eureka-client/info", String.class);
		System.out.println("服务 EUREKA-CLIENT/info 返回信息 : " + message);
		System.out.println("调用 服务 EUREKA-CLIENT/info 成功！");
		return "获取的信息:" + message;
	}

}
