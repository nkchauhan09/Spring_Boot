package com.lombok.lombok.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id @GeneratedValue
	Long id;
	
	String first;
	String last;
	String email;
	Date dob;
	Boolean active;
	
	private User(){}

}
