package com.avi.java.ConditionalStatement;

public class NestedIf 
{

	public static void main(String[] args) 
	{
		int age=19;
		String gender="male";
		
		if(age>=18)
		{
			System.out.println("Person eligible for voting");
		
			if(gender=="male"&&age>=18)
		{
			System.out.println("Person has valid age for marriage");
		}
			else
			{
				System.out.println("person is not eligible for marriage");
			}
		
		 if(age>=30)
		{
			System.out.println("Person eligibal for Apearing government exam");
		}
		else
		{
			System.out.println("Not Eligible for apply gov exam");
		}
		 
		}
		else
		{
			System.out.println("person is not a legal voter");
		}
		}
}
