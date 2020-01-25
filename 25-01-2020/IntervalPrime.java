//Java Program to Display Prime Numbers Between Two Intervals
package com.cts.simple;

import java.util.Scanner;

public class IntervalPrime {
	public static void main(String[] args) {
		System.out.println("enter the range to display prime numbers");
		Scanner scan=new Scanner(System.in);
		int count=0;
		int r1=scan.nextInt();
		int r2=scan.nextInt();
		for(int i=r1;i<=r2;i++)
		{
			
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==0 && i!=1) {
			System.out.println(i);
			}
			count=0;
		
			
		}
	}

}
