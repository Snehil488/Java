package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Emp e = (Emp) con.getBean("emp");
		
		System.out.println(e);
	}

}
