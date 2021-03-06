package com.example.cloudClient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@Value("${spring.profiles.active:}")
	private String activeProfiles;
	
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping(path = "/myValue")
	public String myValue() {
		for (String profileName : activeProfiles.split(",")) {
            if (profileName.equals("dev")) {
            	this.myValue = "Hola Desarrollador";
			} else if (profileName.equals("prod")) {
				this.myValue = "Hola tester";
			}
        }
		return this.myValue;
	}
	
}