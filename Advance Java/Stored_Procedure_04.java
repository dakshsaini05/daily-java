package com.dakshsaini;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Stored_Procedure_04 {
	private static final String DBURL = "jdbc:mysql://localhost:3306/java";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";
	private static final String PROCEDURE = "call p2(101)";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		CallableStatement cstmt = con.prepareCall(PROCEDURE);
		
		ResultSet rs = cstmt.executeQuery();
		if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		con.close();
	}
}
