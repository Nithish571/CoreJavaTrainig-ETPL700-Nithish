package com.evergent.corejava.jdbc.copy;

import java.util.*;
import java.sql.*;

public class Jdbc_CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		String dbname = "evergent2";
		String uname = "root";
		String password = "admin";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + dbname, uname, password);
			while (flag) {
				System.out.println("\n1.Insert \n2.Update \n3.Print Table \n4.Delete \n5.Exit");
				int c = sc.nextInt();
				switch (c) {
				//case 0:
					
				case 1:
					String query1 = "Insert into cse values(?,?,?)";
					PreparedStatement pstmtt = con.prepareStatement(query1);
					System.out.println("Enter Student ID: ");
					int emp = sc.nextInt();
					System.out.println("Enter Name: ");
					String ename = sc.next();
					System.out.println("Enter Section:");
					String sal = sc.next();
					pstmtt.setInt(1, emp);
					pstmtt.setString(2, ename);
					pstmtt.setString(3, sal);
					int i = pstmtt.executeUpdate();
					System.out.println(i + " row inserted");
					System.out.println("\n\n");

				case 3:
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("Select* from cse");
					while (rs.next()) {
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString("name"));
						System.out.println(rs.getString(3));
					}
					break;

				case 4:
					String query2 = "Delete from cse where roll=?";
					PreparedStatement p = con.prepareStatement(query2);
					int del = sc.nextInt();
					p.setInt(1, del);
					int a = p.executeUpdate();
					System.out.println(a + " row deleted");
					break;

				case 2:
					System.out.println("Enter roll to be Updated");
					int d2 = sc.nextInt();
					System.out.println("Enter name to be update:");
					String unamee = sc.next();

					String q = "Update cse SET name=? where roll=?";
					PreparedStatement pp = con.prepareStatement(q);

					pp.setString(1, unamee);
					pp.setInt(2, d2);

					pp.executeUpdate();
					break;

				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
