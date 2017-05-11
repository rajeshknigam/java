package com.hcl.sql.postgresql.service;

import java.util.List;

import com.hcl.sql.postgresql.dao.EmployeeDAO;
import com.hcl.sql.postgresql.dao.EmployeeDAOImpl;
import com.hcl.sql.postgresql.model.Employee;

public class EmpServiceImpl implements EmpService{

	public Employee addEmployee(Employee emp) {
		// write the code for business related for emplyee obbject.
		EmployeeDAO dao = new EmployeeDAOImpl();
		return dao.addEmployee(emp);
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
