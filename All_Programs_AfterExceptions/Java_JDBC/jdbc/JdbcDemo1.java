package com.evergent.corejava.jdbc.copy;

import java.sql.*;

public class JdbcDemo1 {
	
	public static void main(String args[])
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbName="Evergent";
		String driverName="com.mysql.jdbc.Driver";
		String userName="root";
		String password="admin";
		try
		{
			 Class.forName(driverName);   
		        conn = DriverManager.getConnection(url+dbName, userName, password);
		        try{
		          Statement stmt = conn.createStatement();                
		          ResultSet rs=stmt.executeQuery("Select * from employee9");
		              while(rs.next()){
		        	 System.out.println("Employee No :" + rs.getInt(1));
		             System.out.println("Employee Name :" + rs.getString("ename"));
		        	    	System.out.println("Employee sal :"+rs.getInt(3));
			
		              }         }
		        catch(SQLException s){
		          System.out.println(s);
		        }
		        conn.close();
		      }
		      catch (Exception e){
		    	  System.out.println(e);
		       // e.printStackTrace();
		      }
	}
}
