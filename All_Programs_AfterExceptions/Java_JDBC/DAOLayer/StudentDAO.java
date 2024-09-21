package com.evergent.corejava.DAOLayer;

import java.util.*;
import java.sql.*;

public class StudentDAO {
	public int addStu(StudentBean sb) {
		Connection con=null;
		PreparedStatement ptm=null;
		try {
			con=StudentDb.getConnection();
			String query="insert into nithish values(? ,? ,?)";
			ptm.setInt(1, sb.getStuId());
			ptm.setString(2,sb.getStuName());
			ptm.setFloat(3,sb.getStuMarks());
			ptm.setString(4,sb.getStuCourse());
			ptm.setString(5,sb.getStuGrade());
			
			int update=ptm.executeUpdate();
			con.close();
			
			return update;
		//	ptm.get
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}

	/*	try {
			ArrayList al = new ArrayList();
			al.add(sb.getStuId());
			al.add(sb.getStuName());
			al.add(sb.getStuCourse());
			al.add(sb.getStuGrade());
			al.add(sb.getStuMarks());

			System.out.println("Student id=" + sb.getStuId());
			System.out.println("Student Name=" + sb.getStuName());
			System.out.println("Student Course=" + sb.getStuCourse());
			System.out.println("Student Marks=" + sb.getStuMarks());
			System.out.println("Student Grade=" + sb.getStuGrade());
			return 1;

		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	
*/
	}	
}
