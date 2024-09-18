package com.learnspring.lifecycle;



public class IceCream {
	private double price;

	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IceCream(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "IceCream [price=" + price + "]";
	}
	
	public void start() {
		System.out.println("ice cream bean initialized");
	}
	

	public void end() {
		System.out.println("ice cream bean destroyed");
	}
}
