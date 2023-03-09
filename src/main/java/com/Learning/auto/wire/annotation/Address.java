package com.Learning.auto.wire.annotation;

public class Address {
	private String Street;
	private String Landmark;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", Landmark=" + Landmark + "]";
	}
	public Address(String street, String landmark) {
		super();
		Street = street;
		Landmark = landmark;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
