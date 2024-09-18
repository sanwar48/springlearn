package com.learnspring.autowire.annotation;

public class Address {
	private String city;
	private String area;
	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + "]";
	}
	
	
}
