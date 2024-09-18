package com.springlearn.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/ci/ciConfig.xml");
        
        Person p = (Person) context.getBean("person");
        
        System.out.println(p);
        
        Addition addtion  = (Addition) context.getBean("add");

        addtion.doSum();
        

	}

}
