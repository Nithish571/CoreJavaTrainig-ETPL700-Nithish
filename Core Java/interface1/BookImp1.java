package com.evergent.corejava.interface1;
public class BookImp1 implements Book{
	public void bookAuthor()
	{
		System.out.println("Author: APJ ABDUL KALAM");
		//System.out.println(cname);
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
		// TODO Auto-generated method stub
        BookImp1 book=new BookImp1();
        book.bookTitle();
        book.bookAuthor();
        book.bookPrice();
        book.show();
	}
}
