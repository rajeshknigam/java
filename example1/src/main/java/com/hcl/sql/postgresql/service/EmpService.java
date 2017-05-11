package com.hcl.sql.postgresql.service;

import java.util.List;

import com.hcl.sql.postgresql.model.Employee;

public interface EmpService {
	
	/*
	 * Returns the number of Unicode code points in the specified text range of this String.
	 */
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public boolean deleteEmployee(Employee emp);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee();

}
