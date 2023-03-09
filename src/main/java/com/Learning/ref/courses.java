package com.Learning.ref;

public class courses {
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public courses(String cname) {
		super();
		this.cname = cname;
	}

	public courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "courses [cname=" + cname + "]";
	}
	
}
