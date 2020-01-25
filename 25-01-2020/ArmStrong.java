package com.cts.simple;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num1=num;
		int num2=num;
		int sum=0,c=0;
		while(num>0) {
			int rem=num%10;
			c=c+1;
			num=num/10;	
		}
		System.out.println(c);
		while(num1!=0) {
			int rem1=num1%10;
//			for(int i=1;i<=c;i++) {
				double po=Math.pow(rem1,c);
				sum+=po;
				
//			}
			num1=num1/10;
			
		}
		//System.out.println(sum);
		if(sum==num2) {
			System.out.println("The given number " + num2 + " is Armstrong");
		}
		else
		{
			System.out.println("The given number " + num2 + " is  not Armstrong");
	}

}
}
