//Java Program to Count Number of Digits in an Integer
package com.cts.simple;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner scan=new Scanner(System.in);
		int c=0;
		int num=scan.nextInt();
		while(num>0)
		{
			int rem=num%10;
			 c=c+1;
			num=num/10;
		}
		System.out.println("Count of digits in given number is :"+c);
		
	}

}
