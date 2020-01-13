package com.cts.main;

import java.util.Scanner;

public class Store {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter elements of the first array are");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			b[i]=a[i];
		}		
		System.out.println("The  elements copied into second array are");
		for(int i = 0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}

}
