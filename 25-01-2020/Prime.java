//Java Program to Check Whether a Number is Prime or Not
package com.cts.simple;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==0) {
			System.out.println("The given number " + num + " is a prime number");
		}
		else
		{
			System.out.println("The given number " + num + " is not a prime number");
		}
			
	}

}
