package com.demo.eureka.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/gettest")
	public String get() {
		return "hi,i'm producer !";
	}
}
