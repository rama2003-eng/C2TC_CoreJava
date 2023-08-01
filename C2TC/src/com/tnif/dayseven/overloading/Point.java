package com.tnif.dayseven.overloading;

public class Point {
	int sum(int a,int b)
	{
		return a+b;
		
	}
    int sum(int a,int b,int c)
    {
    	return a+b+c;
    }
    float sum(int a,float b,float c)
    {
    	return a+b+c;
    }
    float sum(float a,int b,int c)
    {
    	return a+b+c;
    }
}
