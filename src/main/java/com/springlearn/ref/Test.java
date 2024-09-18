package com.springlearn.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/ref/refConfig.xml");
        
        B b = (B) context.getBean("bref");
        
        System.out.println(b);

	}

}
