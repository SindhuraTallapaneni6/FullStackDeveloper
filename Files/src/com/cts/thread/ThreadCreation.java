package com.cts.thread;

public class ThreadCreation {
	public static void main(String[] args) {
		System.out.println("Main Thread");//By Main Thread
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		FirstThread firstThread=new FirstThread();
		SecondThread secondThread=new SecondThread();
		//firstThread.start();//It will call run() automatically
		//secondThread.start();
		//we have 2 threads 1)main 2)firstthread
		
		Thread threadone=new Thread(firstThread);
		Thread threadtwo=new Thread(secondThread);
		threadtwo.setPriority(Thread.MIN_PRIORITY+3);
		threadone.start();
		threadtwo.start();
		System.out.println(" First Thread priority :" +threadone.getPriority());
		System.out.println("Second Thread Priority :" +threadtwo.getPriority());
//		for(int i=1; i<=5;i++)
//		{
//			System.out.println("Main Thread :" +i);
//			//Thread.sleep(2000);
//		}
	}

}
//odd values
class FirstThread implements Runnable//we cannot apply start() while using implements
{
	@Override
	public void run()
	{
		for(int i=1 ;i<=10;i++)
		{
			if(i%2!=0)
			{
			System.out.println("First Thread:" +i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
//even values
class SecondThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1 ;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println("Second Thread:" +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
