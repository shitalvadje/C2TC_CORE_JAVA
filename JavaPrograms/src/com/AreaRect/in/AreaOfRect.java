package com.AreaRect.in;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		System.out.println("Enter Length and Width:");
		Scanner len=new Scanner(System.in);
		Scanner wt=new Scanner(System.in);
		
		int area=len.nextInt()*wt.nextInt();
		System.out.println("Area= "+area);

	}

}
