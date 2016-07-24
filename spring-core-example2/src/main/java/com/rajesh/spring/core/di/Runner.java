package com.rajesh.spring.core.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("di_beans.xml");

		System.out.println("--------------------DI Setter---------------------------");
		Employee employee = (Employee) context.getBean("employeeSetter");
		System.out.println(employee.toString());
	
		System.out.println("--------------------DI Setter End---------------------------");

		System.out.println("--------------------DI Con---------------------------");
		Employee employee1 = (Employee) context.getBean("employeConstrutor");
		System.out.println(employee1.toString());
	
		System.out.println("--------------------DI Con End---------------------------");

	}
}