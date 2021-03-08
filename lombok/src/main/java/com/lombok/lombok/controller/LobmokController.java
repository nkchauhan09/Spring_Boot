package com.lombok.lombok.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lombok.lombok.student.Student;

@RestController
public class LobmokController {
	
	@RequestMapping("/lombok")
	public String lombok() {
		Student student = new Student();
		student.setName("Neeraj chauhan");
		return student.getName(); 
	}

}
