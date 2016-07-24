package com.rajesh.spring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println("--------------------Life Cycel---------------------------");
		SimpleBeanLifeCycle simplebean = (SimpleBeanLifeCycle) context.getBean("bean3");
		simplebean.sayHello();
		
		context.refresh();
		context.registerShutdownHook();
		context.destroy();
	
		System.out.println("--------------------Life Cycel End---------------------------");


	}
}