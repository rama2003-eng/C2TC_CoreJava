package com.tnif.dayseven.overriden;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		Dog b=new Dog();
		b.eat();
		Cat c=new Cat();
		c.eat();
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		HDFC e=new HDFC();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("HDFC"
				+ " Rate of Interest: "+e.getRateOfInterest()); 

	}

}
