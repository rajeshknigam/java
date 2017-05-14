package com.hcl.sql.postgresql.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.hcl.sql.postgresql.connection.ConnectionFactory;
import com.hcl.sql.postgresql.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	public Employee addEmployee(Employee emp) {
		try {
			Connection con = ConnectionFactory.getConnection();
			con.setAutoCommit(true);

			Statement stmt = con.createStatement();

			String sql = "INSERT INTO public.\"EMPLOYEE\" (\"ID\", \"FNAME\", \"LNAME\", \"ECODE\", \"EMAIL\") "
					+ "VALUES (3, '"+emp.getFname()+"', '"+ emp.getLname()+"', '"+ emp.getEcode()+"', '"+emp.getEmail()+"' );";
				
			System.out.println("Execurting SQL:"+sql);
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return emp;
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
