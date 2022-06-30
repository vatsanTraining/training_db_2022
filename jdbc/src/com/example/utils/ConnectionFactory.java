package com.example.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class ConnectionFactory {

	public static Connection getMySqlConnection() {
		
		Connection con = null;
		
		
		try {
			ResourceBundle labels = ResourceBundle.getBundle("application");

			con = DriverManager.getConnection(labels.getString("datasource.mysql.url")
					       ,labels.getString("datasource.mysql.username"),
					       labels.getString("datasource.mysql.password"));
			
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static Connection getPostgressConnection() {

		 Connection con = null;
		
		
		try {
			ResourceBundle labels = ResourceBundle.getBundle("application");

			con = DriverManager.getConnection(
					        labels.getString("datasource.postgres.url"),
					        labels.getString("datasource.postgres.username"),
					       labels.getString("datasource.postgres.password"));
			
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}


}
