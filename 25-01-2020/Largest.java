//Java Program to Find the Largest Among Three Numbers
package com.cts.simple;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("The value " + a + " is greater");
			}
			else {
				System.out.println("The value " + b + " is greater");
			}
		}
		else {
			System.out.println("The value " + c + " is greater");
		}
	}

}
