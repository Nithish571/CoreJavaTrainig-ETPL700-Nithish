package com.evergent.corejava.javabeans;

public class StudentBeans {
	private String sname;
	private int sclass;
	private double sfees;
	
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	public void setSfees(double sfees) {
		this.sfees = sfees;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Student Name:"+sname+"\nStudent Class:"+sclass+"\nStudent Fees:"+sfees;
}
}
