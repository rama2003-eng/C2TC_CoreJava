package com.tnif.daytwo;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=60;
		if(marks<=50)
		{
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<=60)
		{
			System.out.println("Grade C");	
		}
		else if(marks>=60 && marks<=70)
		{
			System.out.println("Grade B");
		}
		else
		{
			System.out.println("Grade A");
		}
		

	}

}
