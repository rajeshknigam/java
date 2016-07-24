package com.rajesh.spring.core.instance_creation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println("--------------------singlton---------------------------");
		for (int i = 0; i < 10; i++) {
			SimpleBean singlton = (SimpleBean) context.getBean("bean1");
			singlton.sayHello();
		}
		
		System.out.println("--------------------prototype---------------------------");
		for (int i = 0; i < 10; i++) {
			SimpleBean prototype = (SimpleBean) context.getBean("bean2");
			prototype.sayHello();
		}
	}
}