package com.learnspring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	
	private int price;

	public Pepsi() {
		super();
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("pepsi bean initialize");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("pepsi bean dispose");
	}
	
	

}
