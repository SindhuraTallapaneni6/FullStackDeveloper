//Java Program to Swap Two Numbers
package com.cts.simple;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before Swapping value of a:" + a + "value of b : "+ b );
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping value of a:" + a + "value of b :"+ b);
	}

}
