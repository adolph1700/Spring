package com.Learning.constructorInjection;

public class Certi {
	String key;

	@Override
	public String toString() {
		return this.key;
	}
	
	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certi(String key) {
		this.key = key;
	}
	
	
}
