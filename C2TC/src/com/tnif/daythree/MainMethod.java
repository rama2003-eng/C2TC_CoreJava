package com.tnif.daythree;
public class MainMethod {

	public static void main(String[] args) {
		System.out.println("-----------DEFAULT CONSTRUCTOR------------");
		ConstructorClass obj=new ConstructorClass();
		obj.display();
		System.out.println("-----------PARAMETERIZED CONSTRUCTOR------------");
		ConstructClass ob=new ConstructClass(102,"Rama");
		ob.display();
		Encapsulate o=new Encapsulate();
		o.setName("Rama");
		o.setId(102);
		o.setEmail("rama@gmail.com");
		o.setNum(46976027);
		System.out.println(o.toString());

	}

}
