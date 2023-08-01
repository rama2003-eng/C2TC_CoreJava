package com.tnif.dayfive;
//SINGLE INHERITANCE
class Citizen {
	String name;
	String city;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	void display()
	{
		System.out.println("name "+name+"city "+city);
	}
}
class Student extends Citizen{
   int id;
   String dep;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
}
void display()
{
	System.out.println("Name "+name+" City "+city+" Id "+id+" Dep "+dep);
}  
}
//MULTILEVEL INHERITANCE
class Country{
	String cname;
	int ccode;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
}
class State extends Country{
	String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
class City extends State{
	String cityname;
	int pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", pincode=" + pincode + ", sname=" + sname + ", cname=" + cname
				+ ", ccode=" + ccode + "]";
	}
}
//HIERACHICAL INHERITANCE
class People{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Stud extends People{
	int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
class Emp extends People{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}
