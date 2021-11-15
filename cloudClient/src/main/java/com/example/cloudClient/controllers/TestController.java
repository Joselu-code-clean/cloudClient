package com.example.cloudClient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path = "/myValue")
	public String myValue() {
		return this.myValue;
	}
	
}