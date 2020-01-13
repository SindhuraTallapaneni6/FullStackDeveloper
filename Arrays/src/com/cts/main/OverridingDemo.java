package com.cts.main;

public class OverridingDemo {
public static void main(String args[]) {
	//A employee=new A();
	//employee.display();
	B manage=new B();
	manage.display();
	A employee=new B();
	employee.display();
	
}
}
class A{
	public void display() {
	System.out.println("Employee class");
	}
	
}
class B extends A{
	public void display() {
		System.out.println("Manager class");
	}
}