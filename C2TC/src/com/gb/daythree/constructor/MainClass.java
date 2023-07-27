package com.gb.daythree.constructor;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------DEFAULT CONSTRUCTOR------------");
		ConstClass obj=new ConstClass();
		obj.display();
		System.out.println("-----------PARAMETERIZED CONSTRUCTOR------------");
		ConsClass ob=new ConsClass(102,"Rama");
		ob.display();
		System.out.println("-----------CONSTRUCTOR OVERLOADING------------");
		ConClass c1=new ConClass(102,"Rama");
		ConClass c2=new ConClass(102,"Rama",20);
		c1.display();
		c2.display();
	}

}
