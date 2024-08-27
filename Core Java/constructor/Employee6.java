package com.evergent.corejava.constructor;

class Employeer
{
	int eno;
	static int enom=99;
	public Employeer(int eno)
	{
		System.out.println("this is first constructor");
	}
}
class Employee6 extends Employeer
{
	int sal;
    public Employee6(int eno)
    {
    	super(eno);
    	System.out.println(enom);
    	this.sal=sal;
    	System.out.println("Super Keyword"+eno+"salary"+sal);
    }
    public static void main(String args[])
    {
    	Employee6 n=new Employee6(12);
    }
}