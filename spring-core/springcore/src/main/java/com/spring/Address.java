package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	//@Value("Haryana")
	private String city;
	//@Value("491002")
	private int pincode;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
