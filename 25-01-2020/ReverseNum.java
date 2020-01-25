//Java Program to Reverse a Number
package com.cts.simple;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("enter any number");
		int sum=0;
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse of the given number is:" + sum);
	}

}
