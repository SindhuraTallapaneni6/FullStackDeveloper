package com.cts.main;
import java.util.Scanner;
public class SecondLargest {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			//for(int j=i+1;j<n;j++)
			//{
				if(a[i]>a[i+1])
				{
					b[i]=a[i];
				
				}
				else
				{
					b[i]=a[i+1];
				}
			//}
		}
		
		
		System.out.println("The second largest number is "+b[1]);
	}
}
