package com.EvenOdd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a%2 == 0)
			System.out.println("It is even number");
		else
			System.out.println("It is odd number");

	}

}
