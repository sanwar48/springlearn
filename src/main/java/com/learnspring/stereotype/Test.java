package com.learnspring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.collection.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/stereotype/stereoConfig.xml");
		
		Student student =  context.getBean("newStudent", Student.class);
		
		Student student2 =  context.getBean("newStudent", Student.class);
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());

	}
}
