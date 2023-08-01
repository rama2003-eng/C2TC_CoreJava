package com.tnif.daythree;

//default constructor
class ConstructorClass {
	int id;
	String name;
	void display()
	{
		System.out.println(id +" "+name);
	}

}
//parameterized constructor
class ConstructClass {
	int id;
	String name;
	ConstructClass(int i,String n){
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id +" "+name);
	}
}