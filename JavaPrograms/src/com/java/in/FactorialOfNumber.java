package com.java.in;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int x=5,i;
		int res=1;
		for(i=x;i>1;i--)
		{
			res=res*i;
		}
		System.out.println("Factorial of "+x+" is "+res);

	}

}
