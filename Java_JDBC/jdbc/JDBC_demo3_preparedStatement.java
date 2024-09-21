package com.evergent.corejava.jdbc.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_demo3_preparedStatement {
	public static void main(String args[]) {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driverManager="com.mysql.jdbc.Driver";
		String uname="root";
		String password="admin";
		String dbName="db1";
		
		try {
			Class.forName(driverManager);
			con=DriverManager.getConnection(url+dbName,uname,password);
			String query="Insert into employee values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 571);
			pstmt.setString(2, "Nithish");
			pstmt.setInt(3, 459990);
			
			int i=pstmt.executeUpdate();
			
			System.out.println("Inserted Sucessfully"+i);
			
			pstmt.close();
			con.close();
			
			
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		
	}

}
