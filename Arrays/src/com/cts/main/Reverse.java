package com.cts.main;
import java.util.Scanner;
public class Reverse {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Array elements in reverse order");
		for(int i=n-1;i>=0;i--)
		{
		System.out.println(a[i]);
		}
	}

}
