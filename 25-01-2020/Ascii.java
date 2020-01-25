//Java Program to Find ASCII Value of a character
package com.cts.simple;

import java.util.Scanner;

public class Ascii {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character to find its ascii");
		char ch=scan.next().charAt(0);
		int value=ch;
		System.out.println("The Ascii value of character " +  ch  + " is : "+ value );
	}
}
