package com.hcl.sql.postgresql.runner;

import com.hcl.sql.postgresql.model.Employee;
import com.hcl.sql.postgresql.service.EmpServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		EmpServiceImpl service = new EmpServiceImpl();
		
		Employee emp = service.addEmployee(buildEmployeeObject());
		System.out.println(emp.toString());

	}

	private static Employee buildEmployeeObject(){
		Employee emp = new Employee();
		emp.setFname("Ashu");
		emp.setLname("Singh");
		emp.setEmail("Ashu@cdac.co.in");
		emp.setEcode("121");
		
		return emp;
	}
}
