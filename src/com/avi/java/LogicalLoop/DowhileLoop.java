package com.avi.java.LogicalLoop;

public class DowhileLoop {
	

	public static void main(String[] args) 
	{
		
		System.out.println("Odd values from 1 to 100");
		
		int i=0;
		
		do
			{
			System.out.print(i+",");
			
			i=i+2;
			}
		while(i<=100);
		
		System.out.println();
		System.out.println("Even values from 1 to 100");
	
	
	int j=1;
	
	do {
		System.out.print( j +",");
		
		j=j+2;
	}
	while(j<=100);


	}
}
