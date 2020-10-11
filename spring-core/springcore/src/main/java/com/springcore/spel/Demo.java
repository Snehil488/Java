package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	
	public Demo() {
		super();
	}
	@Value("#{222+3}")
	private int x;
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(169)}")                     //T(class).method(param)
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double E;
	
	@Value("#{8>2}")
	private boolean isActive;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", isActive=" + isActive + "]";
	}
	
	
}
