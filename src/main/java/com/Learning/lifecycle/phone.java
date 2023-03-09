package com.Learning.lifecycle;

public class phone {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("I have set price");
	}

	public phone(double price) {
		super();
		this.price = price;
	}

	public phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "phone [price=" + price + "]";
	}
	public void init() {
		System.out.println("This is init,");
	}
	public void destroyer() {
		System.out.println("This will destroy");
	}
	
}
