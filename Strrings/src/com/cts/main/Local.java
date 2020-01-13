package com.cts.main;
 class Locaal {
	
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
public class Local{
	public static void main(String args[])
	{
		Locaal l=new Locaal();
		//Locaal.inner in=new  Local.Locaal();
		l.display();
	}
}
