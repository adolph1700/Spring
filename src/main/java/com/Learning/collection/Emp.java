package com.Learning.collection;
import java.util.*;

public class Emp {
	private String Name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	private Properties props;
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses, Properties props) {
		super();
		Name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return Name;
	}
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + ", props="
				+ props + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		Name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
