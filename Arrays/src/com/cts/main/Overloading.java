package com.cts.main;
public static final double pi 3.14;
public class Overloading {
	public static void main(String args[]) {
		
	}
}
	public void Area(double a) {
		System.out.println("Area of Square is:"+a*a);
	}
	public void Area(double a,double b) {
		double c=a+b;
		System.out.println("Area of Square is:"+2*c);
	}
	public void Area(int a) {
		System.out.println("Area of circle:"+(a*a*pi);
	}



