package com.evergent.corejava.javabeans;
import java.io.*;
public class EmployeeBeans implements Serializable{
	private int eno;
	private String ename;
	private double esal;
public void setEno(int eno)
{
	this.eno=eno;
}
public int getEno()
{
	return eno;
}
public void setEname(String ename)
{
	this.ename=ename;
}
public String getEname()
{
	return ename;
}
public void setEsal(double esal)
{
	this.esal=esal;
}
public double getEsal()
{
	return esal;
}
}
