package com.Learning.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class laptop implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public laptop(double price) {
		super();
		this.price = price;
	}

	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "laptop [price=" + price + "]";
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INit method");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
		
	}
	

}
