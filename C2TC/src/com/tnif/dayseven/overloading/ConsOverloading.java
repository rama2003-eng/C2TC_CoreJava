package com.tnif.dayseven.overloading;

public class ConsOverloading {
	float x=0.0f;
	float y=0.0f;
	ConsOverloading()
	{
		x=0.0f;
		y=0.0f;
	}
	ConsOverloading(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "ConsOverloading [x=" + x + ", y=" + y + "]";
	}
	

}
