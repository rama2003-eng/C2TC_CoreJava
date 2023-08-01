package com.cg.daythree.inheritance;
//single inheritance
class Single {
	void parent()
	{
		System.out.println("parent class");
	}
}
class Child extends Single {
	void children()
	{
		System.out.println("children class");
	}
}
//multilevel inheritance
class ClassA
{
	void sum(int a,int b)
	{
		System.out.println("Sum is" +(a+b));
	}
}
class ClassB extends ClassA
{
	void sub(int a,int b)
	{
		System.out.println("subraction" + (a-b));
	}
}
class ClassC extends ClassB
{
	void mul(int a,int b)
	{
		System.out.println("multiplication" + (a*b));
	}
}
//hierarchical inheritance
class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("Meowing");
	}	
}



