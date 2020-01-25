//Java Program to Find all Roots of a Quadratic Equation
package com.cts.simple;

import java.util.Scanner;

public class QuadraticRoots {
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter three numbers");
	  double a=scan.nextDouble();
	  double b=scan.nextDouble();
	  double c=scan.nextDouble();
	  double root1;
	  double root2;
	  double value=b * b - 4 * a *c;
	  if(value>0) {
		    root1=(-b + Math.sqrt(value))/(2*a);
		    root2=(-b - Math.sqrt(value))/(2*a);
		  System.out.println("root1 :"+ root1 + "root2 :"+ root2);
	  }
	  else if(value==0) {
		  root1=root2= -b/(2*a);
		  System.out.println("root1 :"+ root1 + "root2 :"+ root2);
	  }
	  else {
		  double imag1=-b/(2*a);
		  double real1=Math.sqrt(-value)/2*a;
		  System.out.println("root "+ imag1 +"+"+-real1+ "root2:" +imag1+ " -"+real1) ;
		  
		  
		  
	  }
	  
 }
}
