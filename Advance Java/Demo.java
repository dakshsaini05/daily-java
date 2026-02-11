package com.dakshsaini;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class Demo {
	
	private static final String DBURL = "jdbc:mysql://localhost:3306/regex1";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";
	
	private static final String INSERTSQL = "Insert into regex1 values(1, 'John', 'Jaipur')";
	
	public static void main(String[] args) throws Exception {
		// 1. Load the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get the Connection
		Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		// 3. Create Statement 
		Statement stmt = con.createStatement();
		
		// 4. execute & Process the Result();
		int rowsaffected = stmt.executeUpdate(INSERTSQL);
		System.out.println(rowsaffected);
		
		// 5. Close the connection 
		con.close();
	}
}
