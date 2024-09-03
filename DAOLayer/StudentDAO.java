package com.evergent.corejava.DAOLayer;

import java.util.*;

public class StudentDAO {
	public int addStu(StudentBean sb) {

		try {
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
	}

}
