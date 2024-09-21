package com.evergent.corejava.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class YoutudeJDBC {

	public static void main(String[] args) {
		try
		{
			String driverName="com.mysql.jdbc.Driver";
		Class.forName(driverName);
		String url="jdbc:mysql://localhost:3306/db";
		String userName="root";
		String password="admin";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String query="select *from nith";
		boolean b1=stmt.execute(query);
		
		System.out.println("Connected Sucessfully "+b1);
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
		System.out.print(rs.getInt(1));
		System.out.print(rs.getString(2));
		System.out.print(rs.getString("city"));
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
