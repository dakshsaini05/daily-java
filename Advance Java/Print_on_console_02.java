package com.dakshsaini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Print_on_console_02 {
	private static final String DBURL = "jdbc:mysql://localhost:3306/java";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";
	private static final String SELECTSQL = "select * from user";
	
	public static void main(String[] args) throws Exception {
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// get the connection
		Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		// create statement
		Statement stmt = con.createStatement();
		
		// fetch the existing data
		ResultSet rs = stmt.executeQuery(SELECTSQL);
		if(rs.next()) {
			int studentID = rs.getInt(1);
			String studentName = rs.getString(2);
			String studentAddress = rs.getString(3);
			System.out.println(studentID+" "+studentName+" "+studentAddress);
		}
		
		// close the connection
		con.close();
	}
}
