package com.cg.daytwo.classesandobject;

public class MethodClass {
	int sum()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	void sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("sub is "+ c);	
	}
	int mul()
	{
		int a=10,b=20;
		return a*b;
	}
	void div(int a,int b)
	{
		System.out.println("div is "+ a/b);	}

}
