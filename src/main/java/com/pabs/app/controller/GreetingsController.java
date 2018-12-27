package com.pabs.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {
	
	@GetMapping("/greetings")
	public String getGreetings() {
		return "Greetings";
	}

}
