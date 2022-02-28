package com.avi.java.array;

import java.util.Arrays;

public class OneDimensionalArray
{
public static void main(String[] args) {
	
	
	int []a= {1,2,3,4,};
	
	String[]b= {"Avinash","Dhumal"};
	
	char []c= {'a','b'};
	
	
	int []d=new int[6];
	d[0]=4;
	d[1]=5;
     d[2]=8;
	d[3]=7;
	d[4]=2;
	d[5]=9;
	
	
	
	
	System.out.println("Length of array="+a.length);
	
	System.out.println(d.length);
	
	int sum ;
	sum=a[2]+d[2];
	System.out.println("sum=a[2]+d[2]= "+sum);
	
	for(int i=0; i<=a.length-1; i++)
	{
		System.out.println(a[i]);
	}
	
	for(int j=0; j<b.length; j++)
	{
		System.out.print(b[j]+" ");
	}

	System.out.println();
	
	int []h= {450,45,78,96,369,456,789,4125,45,78,13};
	
	Arrays.sort(h);
	
	for (int y=0; y<h.length; y++)
	{
		System.out.print(h[y]+", ");
	}
	System.out.println();
	for(int s=h.length-1; s>=0; s--)
		
	{
		
		System.out.print(h[s]+", ");
	}
	System.out.println();
	
	
	for(int m=b.length-1; m>=0; m--)
	{
		System.out.print(b[m]+", ");
	}
	
	
	
	
}
}
