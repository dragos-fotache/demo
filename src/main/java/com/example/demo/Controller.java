package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(HttpEntity<String> requestEntity) {
		
		requestEntity.getBody();
		
		return "";
	}
	
}
