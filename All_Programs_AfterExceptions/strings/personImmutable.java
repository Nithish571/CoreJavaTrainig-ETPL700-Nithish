package com.evergent.corejava.strings;
public final class personImmutable {
	private final String name;
	private final int age;
	public personImmutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String myName()
	{
		return name;
	}
	public int myAge()
	{
		return age;
	}
	public static void main(String args[])
	{
		personImmutable p=new personImmutable("Nithis",21);
		System.out.println(p.myName());
		System.out.println(p.myAge());
		
	}
}
