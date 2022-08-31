package com.java.in;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fno=0;
		int sno=1;
		System.out.println(fno);
		System.out.println(sno);
		int res=fno+sno;
		while(res<100)
		{
			System.out.println(res);
			fno=sno;
			sno=res;
			res=fno+sno;
		}

	}

}
