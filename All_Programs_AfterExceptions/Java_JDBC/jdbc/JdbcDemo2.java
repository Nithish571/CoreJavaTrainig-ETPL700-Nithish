package com.evergent.corejava.jdbc.copy;

import java.sql.*;

public class JdbcDemo2 {
	public static void main(String args[]) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/db1";
		String dbName = "db1";
		String driveName = "com.mysql.jdbc.Driver";
		String username = "root";
		String password = "admin";
		try {
			Class.forName(driveName);
			con = DriverManager.getConnection(url, username, password);
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("Select *from Student");
				while(rs.next())
				{
					System.out.println("Student Id: "+rs.getInt(1)+" Student  name: "+rs.getString("name"));
					System.out.println("Student sal :"+rs.getInt(3));
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
