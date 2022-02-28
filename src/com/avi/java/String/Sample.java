package com.avi.java.String;

public class Sample {
	
	public static void main(String[] args) {
		
		
		String a="Avinash Dhumal";
		
		String b="Aspire";
		
		String d=" is From ";
		
		String c="aspire";
		
		String s1="Aspire Institute Training";
		
		
		System.out.println(a.toLowerCase());
		
		System.out.println(b.toUpperCase());
		
		System.out.println(a.isEmpty());
		System.out.println(a.equals(b));
		System.out.println(c.equalsIgnoreCase(b));
		System.out.println(a.lastIndexOf("s"));
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("s"));
		
		System.out.println(a.substring(2));
		
		System.out.println(a.substring(1, 13));
		
		System.out.println(a.concat(d.concat(b)));
		
		System.out.println((b.toLowerCase()).contains(c));
		
		System.out.println(a.startsWith("A"));
		
		System.out.println(a.endsWith("l"));
		
		System.out.println(a.replace("Avinash", "Er Avinash"));
		
		String []b1=s1.split("");
		
		for(int z=0; z<b1.length; z++)
		{
			System.out.print(b1[z]);
		}
		
		System.out.println();
		for(int x=b1.length-1; x>=0; x--)
		{
			System.out.print(b1[x]);
		}
		
		System.out.println();
		
		for(Object g:b1)
		{
			System.out.print(g);
		}
		
		
	}

}
