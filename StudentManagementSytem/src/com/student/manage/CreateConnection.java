package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this class is responsible for creating connection

public class CreateConnection {
	
	static Connection connection=null;
	
	public static Connection giveConnection() {
		
		
		
		//1 Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver added");
		    //In newer versions driver is loaded automatically no need to load explicitly
		    }
		catch(ClassNotFoundException e){
			e.printStackTrace();
			}
		
		//2 Create connection 
		
		
		final String url="jdbc:mysql://localhost:3306/students";
		final String user="root";
		final String password="123456789";
		
		try {
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("Connection Sucessfull");
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		
		return connection;
		
	}

}
