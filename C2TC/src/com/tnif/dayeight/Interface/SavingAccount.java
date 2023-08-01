package com.tnif.dayeight.Interface;

public class SavingAccount extends Person implements Bank{
	int accNo;
	float balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void deposit(float amt)
	{
		if(amt>25000)
		{
		   System.out.println("Exceed limit");	
		}
		else {
			balance+=amt;
			System.out.println("Total balance "+balance);
			
		}
	}
	public void withdraw(float amt)
	{
		if(amt>balance) {
			System.out.println("Insufficient amount");
		}
		else {
			balance-=amt;
			System.out.println("amount withdrawn "+amt);
			System.out.println("Your account balance "+balance);
		}
	}
	@Override
	public String toString() {
		return "SavingAcoount [accNo=" + accNo + ", balance=" + balance + ", name=" + name + ", city=" + city + "]";
	}
	

}
