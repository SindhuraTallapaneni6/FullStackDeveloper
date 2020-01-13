package com.cts.main;

import java.util.Scanner;

public class Test {
	public static final double PI;
	
	public static void main(String args[])
	{
		Areaa ar=new Areaa();
		ar.display();
	}

}
class Areaa{
	public static final double PI=3.14;
	public void display() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter value of a");
	int a=scan.nextInt();
	System.out.println(a*a*PI);
}
}