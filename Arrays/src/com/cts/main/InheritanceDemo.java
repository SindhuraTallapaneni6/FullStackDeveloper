package com.cts.main;

import java.util.Scanner;

public class InheritanceDemo {
	

public static void main(String args[])
{
		Manager m=new Manager();
		m.getData();
		m.getDisplay();
}
}
 
class Employee
{
	String name;
	int id;
	int count;
	String cname;
	String dname;
	String team[];
	public void getData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the id : ");
		id=Integer.parseInt(scan.nextLine());
		System.out.print("Enter the name : ");
		name=scan.nextLine();
		System.out.print("Enter the company name : ");
		cname=scan.nextLine();
		System.out.println("enter the dept name :");
		dname=scan.nextLine();
		System.out.println("Enter the count of team members");
		count=scan.nextInt();
		for(int i=0;i<count;i++)
		{
			team[i]=scan.nextLine();
			System.out.print(team[i] );
		}
	}
	public void getDisplay() {
		System.out.println("empid :" + id +"name : " +name+"companyname :" +cname);

	}
	
}
class Manager extends Employee{
	
	
}
class Developer extends Employee{
	String domain;
	String pname;
	int duration;
}
