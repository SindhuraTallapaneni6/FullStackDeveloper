//Java Program to Check Whether a Number is Palindrome or Not
package com.cts.simple;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	System.out.println("Enter any number");
	Scanner scan =new Scanner(System.in);
	int sum=0;
	int num=scan.nextInt();
	int num1=num;
	while(num>0) {
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		
	}
	if(num1==sum) {
		System.out.println("the given number" + num1 +  "is palindrome");
	}
	else
		System.out.println("the given number" + num1 + " is not a palindrome");
}
}
