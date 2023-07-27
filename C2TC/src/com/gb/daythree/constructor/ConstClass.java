package com.gb.daythree.constructor;
//default constructor
class ConstClass {
	int id;
	String name;
	void display()
	{
		System.out.println(id +" "+name);
	}

}
//parameterized constructor
class ConsClass {
	int id;
	String name;
	ConsClass(int i,String n){
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id +" "+name);
	}
}
//constructor overloading
class ConClass {
	int id;
	String name;
	int age;
	ConClass(int i,String n){
		id=i;
		name=n;
	}
	ConClass(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id +" "+name+" "+age);
	}
}

