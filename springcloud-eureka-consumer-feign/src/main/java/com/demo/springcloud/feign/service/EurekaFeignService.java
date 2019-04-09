package com.demo.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="eureka-client")
public interface EurekaFeignService {
	
	@RequestMapping(value = "/info")
    String getInfo();

}
