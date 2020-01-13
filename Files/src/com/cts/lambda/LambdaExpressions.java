package com.cts.lambda;

public class LambdaExpressions {

	public static void main(String[] args) {
//		Runnable r=() ->{ System.out.println("I an Runnable Interface");
//		
//		};
//		Thread t=new Thread();
//		t.start();
//		
//	}
		
		
//		Hello h= (a, b) -> a+b;
//		System.out.println(h.add(10, 20));
//		
		
		
//		Hello hello=new Hello() {
//			
//			@Override
//			public void display() {
//				System.out.println("inner class");
//			}
//		};
//		hello.display();
//		
		
	//using Lambda expressions	
	Hello h=() -> {
			System.out.println("this is Lambda expression");
			System.out.println("this is Lambda expression");
		};
	h.display();	}

}

interface Hello{
	public void display();
	//writing another methods gives error as it is functional interface we need to write only one method
	
	
	//public int add(int a,int b);
}
