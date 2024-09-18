package com.learnspring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/lifecycle/lifeCycleConfig.xml");
        
        Samosa samosa = (Samosa) context.getBean("samosa");
        
        System.out.println(samosa);
        
//        context.registerShutdownHook();
        
        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        
        System.out.println(pepsi);
        
        context.registerShutdownHook();
        
	}
}
