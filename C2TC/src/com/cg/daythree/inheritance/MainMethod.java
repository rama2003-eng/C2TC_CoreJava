package com.cg.daythree.inheritance;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------SINGLE INHERITANCE-----------");
		Child obj=new Child();
		obj.children();
		obj.parent();
		System.out.println("-----------MULTILEVEL INHERITANCE-----------");
		ClassC ob=new ClassC();
		ob.sum(20,10);
		ob.sub(50,20);
		ob.mul(20,30);
		System.out.println("-----------HIERARCHICAL INHERITANCE-----------");
		Cat object=new Cat();
		object.eat();
		object.meow();
		

	}

}
