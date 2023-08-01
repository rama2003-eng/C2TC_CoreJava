package com.tnif.daytwo;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------BREAK---------");
        for(int i=0;i<=10;i++)
        {
        	System.out.println(i);
        	if(i==5)
        	{
        		break;
        	}
        }
        System.out.println("------CONTINUE--------");
        for(int i=0;i<=10;i++)
        {
        	if(i==5)
        	{
        		continue;
        	}
        	System.out.println(i);
        }

	}

}
