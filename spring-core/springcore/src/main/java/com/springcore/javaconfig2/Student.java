package com.springcore.javaconfig2;

import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	
	
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
	System.out.println("boi is studying");
	}

}
