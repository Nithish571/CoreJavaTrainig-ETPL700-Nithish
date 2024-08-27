package com.evergent.corejava.interface1;
public interface Book {
	String cname="India"; 
	// we can declare variables inside interfaces by default they are public static final
	// By default all interface methods are abstract 
	abstract public void bookAuthor();
	abstract public void bookPrice();
	public void bookTitle();
}
