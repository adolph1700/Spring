package com.Learning.constructorInjection;

public class Addition {
	private int a;
	private int b;
	public Addition(double a, double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("This is double,double");
	}
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("This is int,int");
		System.out.println(this.a+" "+this.b);
	}
	
	public void sum()
	{
		System.out.println("Sum is"+this.a+this.b);
	}
}
