package com.springlearn.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/collection/collectionConfig.xml");
		
		Employee emp = (Employee) context.getBean("Employee1");
		
		System.out.println(emp);

	}

}
