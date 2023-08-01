package com.tnif.dayseven.overriden;

class Animal {
	void eat()
	{
		System.out.println("Animals eat meal");
	}
}
class Dog extends Animal{
	void eat()
	{
	   System.out.println("Dog barking");	
	}
}
class Cat extends Animal{
	void eat()
	{
	   System.out.println("Cat meowing");	
	}
}
