package com.cts.main;
import java.util.Scanner;
public class Ascending {
	public static void main(String args[]) {
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
		for(int j=i+1;j<n;j++)
		{
		
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			else
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println("The elements in the ascending order are");
	for(int s = 0;s<=n-1;s++)
		System.out.println(a[s]);
	}

}
