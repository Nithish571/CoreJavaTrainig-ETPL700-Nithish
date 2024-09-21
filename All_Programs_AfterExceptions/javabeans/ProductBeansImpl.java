package com.evergent.corejava.javabeans;

public class ProductBeansImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBeans pb=new ProductBeans(12,"Nithish",9877);
	    System.out.println("Product Number :"+pb.getPno());
	    System.out.println("Product Name :"+pb.getPname());
	    System.out.println("Product Proce :"+pb.getPrice());

	}

}

