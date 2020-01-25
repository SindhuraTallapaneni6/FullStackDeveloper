//Java Program to Check Whether a Number is Even or Odd
package com.cts.simple;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any value");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("The number a:" + a + " is even");
		}
		else
		{
			System.out.println("The number a:" + a + " is odd");
		}
		
	}

}
