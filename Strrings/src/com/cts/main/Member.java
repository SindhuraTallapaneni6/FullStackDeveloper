package com.cts.main;

public class Member {
	public static void main(String args[]) {
		Outer2 out=new Outer2();
		out.display();
	}

}
class Outer2{
int x=10; 
static int y=20;
public void display()
{
	class Memmber
	{
		public void show()
		{
			System.out.println(x);
			System.out.println(y);
		}
		class Memmber2
		{
			public void show2()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
	Memmber m=new Memmber();
	m.show();
}
}
