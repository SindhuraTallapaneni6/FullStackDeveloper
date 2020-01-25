//Java Program to Add Two Integers
package com.cts.simple;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("The sum value of two numbers is:"+(a+b));
	}

}
