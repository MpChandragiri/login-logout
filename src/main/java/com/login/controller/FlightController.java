package com.login.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

	@GetMapping("/addFlight")
	public String showAddFlight() {
		
		return "Add Flight";
	}
}
