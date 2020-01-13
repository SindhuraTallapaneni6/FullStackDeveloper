package com.cts.day10;

public class AnonymousDemo {
	public static void main(String args[]) {
		Anonymous an=new Anonymous()
				{
					public void display() {
					System.out.println("gud mrng");	
					}
				};
				an.display();
	}

}
interface  Anonymous{
	 public void display();
	//{
		//System.out.println("hai");
	//}
}