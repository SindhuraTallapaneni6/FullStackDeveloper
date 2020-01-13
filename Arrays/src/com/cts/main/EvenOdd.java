package com.cts.main;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
		int e=0,od=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			if(a[i]%2==0)
			{
				b[e]=a[i];
				e=e+1;
			}
			else
			{
				c[od]=a[i];
				od=od+1;
			}
		}
		System.out.println("even numbers ");
		for(int j=0;j<e;j++)
		{
			System.out.println(b[j]);
		}
		System.out.println("odd numbers ");
		for(int k=0;k<od;k++)
		{
			System.out.println(c[k]);
		}
	}

}
