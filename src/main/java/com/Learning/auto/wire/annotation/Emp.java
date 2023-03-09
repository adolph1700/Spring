package com.Learning.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address12")
	private Address Address;

	public Address getAddress() {
		return Address;
	}
	
	public void setAddress(Address address) {
		Address = address;
		System.out.println("in address setter");
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [Address=" + Address + "]";
	}
	
	public Emp(Address address) {
		super();
		Address = address;
		System.out.println("In Constructor");
	}

	
}
