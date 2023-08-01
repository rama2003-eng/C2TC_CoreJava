package com.tnif.dayfive;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------SINGLE INHERITANCE------------------");
		Student obj=new Student();
		obj.setName("rama");
		obj.setCity("Villupuram");
		obj.setId(102);
		obj.setDep("CSE");
		obj.display();
		System.out.println("----------------MULTILEVEL INHERITANCE------------------");
		City ob=new City();
		ob.setCname("India");
		ob.setCcode(103901);
		ob.setSname("Tamilnadu");
		ob.setCityname("Villupuram");
		ob.setPincode(605652);
		System.out.println(ob.toString());
		System.out.println("----------------HEIRARCHICAL INHERITANCE------------------");
		Emp o=new Emp();
		o.setName("Rama");
		o.setId(1002);
		System.out.println(o.toString());
		
	}
}
