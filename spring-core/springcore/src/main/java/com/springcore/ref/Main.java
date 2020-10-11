package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/ref/spring2.xml");
	  A obj  = (A) con.getBean("aref");
	  
	  System.out.println(obj);

	}

}
