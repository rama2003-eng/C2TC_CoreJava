package com.tnif.dayeight.Interface;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount savings=new SavingAccount();
		savings.setAccNo(201021069);
		savings.setBalance(100000);
		savings.setCity("Banglore");
		savings.setName("Zara");
		savings.deposit(50000);
		savings.withdraw(10000);
		System.out.println(savings.toString());

	}

}
