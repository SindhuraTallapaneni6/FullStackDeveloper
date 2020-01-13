package com.cts.day10;
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			//ExceptionDemo ed=new ExceptionDemo();
			logic();
		
		}
		catch(Exception ex){
	      System.out.println(ex.getMessage());
		}
}
	public static void logic() throws NullPointerException
	{
		System.out.println("Begin");
		int a=10;
		System.out.println("got the number from user");
		if(a==10) {
			throw new ArithmeticException("divided by zero"); 
		}
		int val=10/(10-a);
		
		String name="sindhu";
		name=null;
		System.out.println(name);
	}
	
	}
		/*try{
			System.out.println("Begin");
			int a=Integer.parseInt(args[0]);
			//throw new ArrayIndexOutOfBoundsException("");
			//System.out.println("got the number from user");
			int val=10/(10-a);
			String name="sindhu";
			//String name=null;
			System.out.println(name);
			
		}
		catch(Exception ex ) {
			System.out.println(ex.getMessage());*/
			 
