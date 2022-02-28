package com.avi.java.LogicalLoop;


// to find even value from 1 to 100

public class ForLoop {
	
	public static void main(String[] args) 
	{
		int a=100;
	
		System.out.println("Even value from 1 to 100 is = ");
		for(int i=0; i<=a; i=i+2)
		{
	System.out.print(i+", ");
		}
		
		
		System.out.println("Odd value from 1 to 100is = ");
		
		for (int j=1; j<=99; j=j+2)
		{
			System.out.print(j+", ");
		}
	}

}
