package com.revature.utils;

import java.sql.Connection; //Import from JDBC package
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	//Creating Singleton Design Pattern (connection is the singleton here)
	
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		if(connection!=null) {
			//Checking if there is a connection
			return connection;
		}else {
			//Registering driver	
			try {
				Class.forName("org.postgresql.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String url = "jdbc:postgresql://javafs220725.c7uqwmtdtwsg.us-east-1.rds.amazonaws.com:5432/project0";
			String username = System.getenv("myDatabaseUsername");
			String password = System.getenv("myDatabasePassword");
			
			connection = DriverManager.getConnection(url, username, password);
			
			return connection;
		}
	}
	
	public static void main (String[]args) {
		try {
			getConnection();
			System.out.println("Connected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
