package com.evergent.corejava.DAOLayer;

import java.util.*;
public class StudentMainController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int stuId=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String stuName=sc.next();
		System.out.println("Enter Student Marks: ");
	    float stuMarks=sc.nextFloat();
	    System.out.println("Enter Student Course: ");
		String stuCourse=sc.next();
		
		StudentService ss=new StudentService();
		int k=ss.add(stuId, stuName, stuMarks, stuCourse);
		System.out.println("Inserted Sucess"+k+"Record Nithish Sucess");
	}

}
