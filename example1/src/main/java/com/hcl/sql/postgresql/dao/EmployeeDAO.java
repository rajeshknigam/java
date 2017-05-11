package com.hcl.sql.postgresql.dao;

import java.util.List;

import com.hcl.sql.postgresql.model.Employee;

public interface EmployeeDAO {
	
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public boolean deleteEmployee(Employee emp);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee();

}
