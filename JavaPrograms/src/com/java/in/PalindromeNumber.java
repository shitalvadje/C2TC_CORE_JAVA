package com.java.in;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=151;
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			num=num/10;
			rev=(rev*10)+last;
		}
		if(rev==temp)
			System.out.println(temp+" is palindrome number");
		else
			System.out.println(temp+" is NOT palindrome number");
	}

}
