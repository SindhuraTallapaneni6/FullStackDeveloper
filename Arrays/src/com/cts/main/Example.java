package com.cts.main;

public class Example {
	public static void main(String args[]) {
	//	C c=new C();
	//	C c=new C(10);
		D d=new D();
		
	}
}
class C
{
	C()
	{
		super();
		System.out.println("1");
	}
   C(int a)
	{
		this();
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
}
class D extends C
{
	D()
	{
		super(10);
		System.out.println("4");

	}
	{
		System.out.println("5");
	}
	
}
