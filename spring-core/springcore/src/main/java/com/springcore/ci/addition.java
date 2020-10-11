package com.springcore.ci;

public class addition {

	private int a;
	private int b;
	
	
	public addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("int constructor");
	}
	
    public addition(double a, double b) {
		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double constructor");
	}
    
    void doSum() {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println("Sum is :"+(a+b));
    }
	
	
}
