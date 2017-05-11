package com.hcl.sql.postgresql.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.hcl.sql.postgresql.constants.AppConstants;

public class ConnectionFactory {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(AppConstants.DriverClass);
			conn = DriverManager.getConnection(AppConstants.JDBCurl, AppConstants.DBUserID, AppConstants.DBPaassword);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		System.out.println("Opened database successfully");
	return conn;
	}
}
