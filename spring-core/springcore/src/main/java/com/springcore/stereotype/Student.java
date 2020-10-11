package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s")
//@Scope("prototype")
public class Student {

	@Value("Swastik Verma")
	private String studentName;
	@Value("Hyderabad")
	private String city;
	@Value("#{list}")
	private List<String> Address;
	
	
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
