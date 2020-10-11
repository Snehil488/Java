package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/spring.xml");
		Student s = (Student) con.getBean("stud");
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress().getCity());
		System.out.println(s.getAddress().getPincode());
		
	}
}
