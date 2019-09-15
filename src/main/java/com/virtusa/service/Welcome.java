package com.virtusa.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/demo")
public class Welcome {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to Feature-Branch";
	}
}
