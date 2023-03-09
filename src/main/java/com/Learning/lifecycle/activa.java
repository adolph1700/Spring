package com.Learning.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class activa {
	public String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "activa [price=" + price + "]";
	}

	public activa(String price) {
		super();
		this.price = price;
	}

	public activa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting method activa");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method activa");
	}
}
