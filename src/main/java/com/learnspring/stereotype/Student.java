package com.learnspring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("newStudent")
@Scope("prototype")
public class Student {
	
	@Value("sanwar")
	private String name;
	
	@Value("dhaka")
	private String city;
	
	@Value("#{temp}")
	private List<String> places;
	

	public Student(String name, String city, List<String> places) {
		super();
		this.name = name;
		this.city = city;
		this.places = places;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getPlaces() {
		return places;
	}
	public void setPlaces(List<String> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", places=" + places + "]";
	}
	
	

}
