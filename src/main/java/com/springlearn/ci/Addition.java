package com.springlearn.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor called : double double");
	}
	
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor called : int int");
	}
	

	
	public void doSum() {
		int sum = this.a + this.b;
		
		System.out.println("a = " + this.a + " b = " + this.b);
		
		System.out.println("sum is = " + sum);
	}
}
