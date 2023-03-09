package com.Learning.ref;

public class student {
	private String id;
	private String name;
	private courses cor;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public courses getCor() {
		return cor;
	}
	public void setCor(courses cor) {
		this.cor = cor;
	}
	public student(String id, String name, courses cor) {
		super();
		this.id = id;
		this.name = name;
		this.cor = cor;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", cor=" + cor + "]";
	}
	
}
