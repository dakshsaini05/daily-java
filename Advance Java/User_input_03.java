package com.dakshsaini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class User_input_03 {
	private static final String DBURL = "jdbc:mysql://localhost:3306/java";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";
	private static final String INSERTSQL = "insert into user values(?, ?, ?)";
	private static final String SELECTSQL = "select * from user";
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		// user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter student name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter student address: ");
		String address = sc.nextLine();
		
		PreparedStatement pstmt = con.prepareStatement(INSERTSQL);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, address);
		
		// execute the prepared statement
		int rowsaffected = pstmt.executeUpdate();
		System.out.println(rowsaffected+" rows affected");
		System.out.println("Successfully executed");
		
		// fetch the existing data
		ResultSet rs = pstmt.executeQuery(SELECTSQL);
		while(rs.next()) {
			System.out.println(
					rs.getInt(1)+" "+
					rs.getString(2)+" "+
					rs.getString(3)
			);
		}
		
		con.close();
	}
}
