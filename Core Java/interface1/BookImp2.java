package com.evergent.corejava.interface1;

public class BookImp2 implements Book {
	public void bookAuthor()
	{
		System.out.println("Author: APJ ABDUL KALAM "+cname);
	}
	public void bookTitle()
	{
		System.out.println("Wings of Fire");
	}
	public void bookPrice()
	{
		System.out.println("Price 550/-");
	}
    public void show()
    {
    	System.out.println("This is Local Method");
    }

	public static void main(String[] args) {
		Book b1=new BookImp2();
		b1.bookTitle();
		b1.bookPrice();
		b1.bookAuthor();
		// b1.show() we cannot access by reference

	}

}
