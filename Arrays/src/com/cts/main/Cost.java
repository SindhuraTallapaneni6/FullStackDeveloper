package com.cts.main;
import java.util.*;
public class Cost {
	public static void main(String args[]) {
		System.out.println("The available courses are:");
		System.out.println("1.java--5000 2.C--3000 3.C++--2000 4.Python--4000 5.Angular--6000");

		//System.out.println("Available courses here " +c1+":5000" +c2+":3000" +c3+":2000" +c4+":4000" +c5+":6000");
		Book b=new Book();
		b.Buy();
		
	}	
}
class Book {
	public void Buy() {
		int sum=0;
		Scanner scan=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.println("Enter the courses of ur choice");
		String choice=scan.nextLine();
		if(choice.contains("java")) {
			//sb.append("java-------5000");
			sum=sum+5000;
			
		}
		if(choice.contains("c")) {
			//sb.append("c-------3000");
			sum=sum+3000;
		}
		if(choice.contains("c++")) {
			//sb.append("C++        2000");
			sum=sum+2000;
		}
		if(choice.contains("python")) {
			//sb.append("python       4000");
			sum=sum+4000;
		}
		if(choice.contains("angular")) {
			//sb.append("C++          6000");
			sum=sum+6000;
		}
		System.out.println(sum);
	}
}
