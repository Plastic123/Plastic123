package com.avi.java.ConditionalStatement;

import java.util.Scanner;

public class Switch {
	
	
	int day;
	public void ListOfDays()
	 
	{
		Scanner scan=new Scanner(System.in);
		
		int day=scan.nextInt();
	
	switch(day){
	
	case 1: System.out.println("Today is sunday ");
	      break;
	case 2: System.out.println("Today is monday");   
	      break;
	case 3: System.out.println("Today is tuesday");   
	      break;
	case 4: System.out.println("Today is wednsday ");
    break;

	case 5: System.out.println("Today is thursday");   
    break;

	case 6: System.out.println("Today is friday");   
    break;
    
	case 7:System.out.println("Today is Saturday");
	
	default:
		
     
	
	
		
	}
	}

}
