package com.tnif.daythree;

public class Encapsulate {
	String name;
	int id;
	String email;
	long num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Encapsule [name=" + name + ", id=" + id + ", Email=" + email + ", num=" + num + "]";
	}
}