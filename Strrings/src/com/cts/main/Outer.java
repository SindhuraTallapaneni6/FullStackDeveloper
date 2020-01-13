package com.cts.main;

class Outer1 {
	int x=10;
	static int y=20;
			static class Inner
			{
				public void display()
				{
					System.out.println(y);
				}
			}

}
public class Outer{
	public static void main(String args[])
	{
		Outer1.Inner in=new  Outer1.Inner();
		in.display();
	}
}