package com.cts.main;
import java.util.Scanner;
public class Mangement {
	public static void main(String args[]) {
		System.out.println("whose details u want to enter");
		System.out.println("1.student   2.Employee");
		int option;
		Reuse re=new Reuse();
		Scanner scanner=new Scanner(System.in);
		option=scanner.nextInt();
		switch(option)
		{
		case 1:
			Student s=new Student();
					re.getData();
		          s.getData();
		          re.Display();
		          s.Display();
		          break;
		case 2:Employee1 emp=new Employee1();
					re.getData();
					emp.getData();
					re.Display();
					emp.Display();
						break;
		}
	}
	
}
class Reuse{
	String fname;
	String lname;
	int id,age;
	public void getData()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter ur First name");
	fname=scan.nextLine();
	System.out.println("Enter ur Last name");
	lname=scan.nextLine();
	System.out.println("Enter ur id");
	id=scan.nextInt();
	System.out.println("Enter ur age");
	age=scan.nextInt();
	}
	public void Display()
	{
		System.out.println("Firstname:" +fname+"Lastname:" +lname+"id:" +id+" age:" +age);
	}
	
}
class Student extends Reuse{
	String cname;

	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur coursename");
		cname=sc.nextLine();
		
		
	}
	public void Display()
	{
		System.out.println("Course name:" +cname);
	}
}
class Employee1 extends Reuse{
	String dname,dsgn;
	int salary;
	public void getData() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter department name");
		dname=s.nextLine();
		System.out.println("enter designation");
		dsgn=s.nextLine();
		System.out.println("enter salary");
		salary=s.nextInt();
	}
	public void Display()
	{
		System.out.println("Departmentname:" +dname+"Designation:" +dsgn+"Salary:" +salary);
	}
}

