package com.cts.simple;
//Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;
public class VowelConsonent {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch=scan.next().charAt(0);
		if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='I'||ch=='A'||ch=='E'||ch=='O'||ch=='U') {
			System.out.println("Character " + ch + " is  vowel");
		}
		else {
			System.out.println("Character " + ch + " is  consonent");
		}
	}

}
