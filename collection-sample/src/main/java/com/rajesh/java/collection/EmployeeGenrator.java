package com.rajesh.java.collection;

import java.util.Date;

public class EmployeeGenrator {

	private static int ecode = 0;
	
	public static Employee generateEmployeeObject(){
		Employee emp = new Employee();
		ecode = ecode + 1;
		long time = System.currentTimeMillis();
		
		emp.setfName("FName_"+ecode);
		emp.setlName("LName_"+ecode);
		emp.seteCode(ecode);
		emp.setDateOfJoining(new Date(time));
		emp.setActiveEmployee(true); 
		
		return emp;
	}
}
