package com.glabs.smartHome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartHomeController {
	
	@RequestMapping("/dht11")
	public String getDHT11() {
		return "DHT11 - room temperature 27.7 C";
		
	}

}
