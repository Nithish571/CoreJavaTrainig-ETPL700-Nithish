package com.evergent.corejava.DAOLayer;

import java.sql.*;

public class StudentDb {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "admin");
         return con;
	}

}
