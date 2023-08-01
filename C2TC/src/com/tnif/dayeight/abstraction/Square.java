package com.tnif.dayeight.abstraction;

public class Square extends Shape {
	int side;
	Square()
	{
		side=6;
	}
	void calArea() {
		System.out.println("Area of Square "+side*side);
	}

}
