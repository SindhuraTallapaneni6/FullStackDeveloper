//Java Program to Compute Quotient and Remainder
package com.cts.simple;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter any  two numbers");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("The quotient of the two numbers is: "+(a/b));
		System.out.println("The remainder of the two numbers is: "+(a%b));
	}

}
