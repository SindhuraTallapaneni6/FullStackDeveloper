package com.cts.main;

import java.util.Scanner;

public class Sum {
	public static void main(String args[])
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The sum of the elements stored in array is "+sum);
		
	}


}
