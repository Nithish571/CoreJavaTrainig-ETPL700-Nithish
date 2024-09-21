package com.evergent.corejava.collections.task3;

public class BeansClass {
	private int tid;
	private String tname;
	private double price;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + tid + "name: " + tname + "price: " + price;

	}
}
