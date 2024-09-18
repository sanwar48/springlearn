package com.springlearn.ci;

public class Address {
	
	private String country;

	public Address(String country) {
		super();
		this.country = country;
	}

	@Override
	public String toString() {
		return "Adddress [country=" + country + "]";
	}
	
	

}
