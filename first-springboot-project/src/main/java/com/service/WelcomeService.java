package com.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService
{
	public String RetrieveWelcomeMessage() {
		return "Welcome To Spring Boot";
	}
}