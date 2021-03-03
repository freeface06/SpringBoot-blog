package com.hj.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/test/hello")
	public String helle() {
		return "<h1>hello</h1>";
	}
	
}
