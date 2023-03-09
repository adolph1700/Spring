package com.Learning.adolph;

public class Student {
	public int studenId;
	private String Name;
	private String Address;
	
	@Override
	public String toString() {
		return "Student [studenId=" + studenId + ", Name=" + Name + ", Address=" + Address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studenId, String name, String address) {
		super();
		this.studenId = studenId;
		Name = name;
		Address = address;
	}
	public int getStudenId() {
		return studenId;
	}
	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
