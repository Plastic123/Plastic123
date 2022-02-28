package com.avi.java.array;

public class MultiDim {

public static void main(String[] args) {
	
	int [][]a= {{1,2,3,4,5,6,7},{4,5,69,8,7,8},{8,5,2,3,6,9},{78,5,4,7,8}};
	
	int [][]c=new int[2][2];
	
	c[0][0]=1;
	c[0][1]=4;
	c[1][0]=6;
	c[1][1]=5;
	
	System.out.println(c.length);
	
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	
	for(int m=0; m<4; m++)
	{
		for(int n=0; n<a[m].length; n++ )
		{
			System.out.print(a[m][n]+", ");
		}
		System.out.println();
	}
	
}}
