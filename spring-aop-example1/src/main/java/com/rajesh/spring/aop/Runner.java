package com.rajesh.spring.aop;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	private static final Logger log = Logger.getLogger(Runner.class.getName());

	public static void main(String[] args) {

		log.info("Starting now..");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Employee employee = (Employee) context.getBean("employeConstrutor");
		
		Project proj = new Project();
		proj.setName("MAPI-COE");
		proj.setProjectId(9999);

		Address address = new Address();
		address.setAddressline1("addressline1111");
		address.setAddressline2("addressline2222");
		address.setCity("New Delhi");
		address.setCountry("INDIA");
		address.setPinCode(123456);
		
		employee.updateEmployee("fName", "lName", 99999, proj, address);
		// student.printThrowException();
	}
}