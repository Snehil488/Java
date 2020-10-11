package com.springcore.standalone.collections;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/connfig.xml");
		Person p = (Person) con.getBean("person");
		
		System.out.println(p);
		
		
	

	}

}
