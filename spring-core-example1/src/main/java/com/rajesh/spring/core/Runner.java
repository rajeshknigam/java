package com.rajesh.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloBean1 bean1 = (HelloBean1) context.getBean("bean1");
		bean1.sayHello();

		HelloBean2 bean2 = (HelloBean2) context.getBean("bean2");
		bean2.sayHello();
	}
}