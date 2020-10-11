package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
		
		Emp emp = (Emp) context.getBean("emp");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getPhone());
		System.out.println(emp.getCourses());
	}

}
