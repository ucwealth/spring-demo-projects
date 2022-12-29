package com.ucwealth.loginregistrationsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
}
