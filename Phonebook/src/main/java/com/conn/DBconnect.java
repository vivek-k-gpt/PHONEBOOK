package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static Connection conn = null;
	
	public static Connection getConnect() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","root");
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("inside catch of connnection");
		}
		
		
		return conn;
	}
	
	
	
	
}
