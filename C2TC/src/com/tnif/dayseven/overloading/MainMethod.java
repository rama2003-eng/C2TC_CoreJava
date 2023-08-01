package com.tnif.dayseven.overloading;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------METHOD OVERLOADING--------");
		Point a=new Point();
		System.out.println(a.sum(2,4));
		System.out.println(a.sum(2,4,6));
		System.out.println(a.sum(2,4.0f,8));
		System.out.println(a.sum(2,4.0f,9));
		System.out.println("----------CONSTRUCTOR OVERLOADING--------");
		ConsOverloading ob=new ConsOverloading(20.0f,50.34f);
		System.out.println(ob.toString());
		

	}

}
