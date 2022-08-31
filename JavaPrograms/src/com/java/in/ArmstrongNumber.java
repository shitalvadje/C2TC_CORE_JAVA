package com.java.in;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int res=0;
		
		while(num>0)
		{
			int last=num%10;
			res=res+(last*last*last);
			num=num/10;
		}
		if(temp==res)
			System.out.println(temp+" is Armstrong Number");
		else
			System.out.println(temp+" is NOT Armstrong Number");

	}

}
