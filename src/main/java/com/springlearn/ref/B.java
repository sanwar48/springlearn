package com.springlearn.ref;

public class B {
	private int a;
	private A ob;
	public B(int a, A ob) {
		super();
		this.a = a;
		this.ob = ob;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public A getOb() {
		return ob;
	}
	public void setOb(A ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", ob=" + ob + "]";
	}
	
	
	
	
	
}
