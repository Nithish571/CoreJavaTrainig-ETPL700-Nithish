package com.evergent.corejava.DAOLayer;

public class StudentService {

	public int add(int id,String name,Float marks,String course)
	{
		String grade="";
		if(marks<35)
		{
			grade="C";
		}
		else if(marks<75)
		{
			grade="B";
		}
		else if(marks<85)
		{
			grade="A";
		}
		else
		{
			grade="O";
		}
		
		StudentBean sb=new StudentBean();
		sb.setStuId(id);
		sb.setStuName(name);
		sb.setStuMarks(id);
		sb.setStuCourse(course);
		sb.setStuGrade(grade);
		StudentDAO sd=new StudentDAO();
		int t=sd.addStu(sb);
		
		return t;
		
		
		
	}
}
