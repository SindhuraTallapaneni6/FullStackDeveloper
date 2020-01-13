package com.cts.thread;

public class ThreadSynchronization {

	public static void main(String[] args) {
		Resource resource=new Resource();
		FirstThreadd firstThread=new FirstThreadd(resource);
		SecondThreadd secondThread=new SecondThreadd(resource);
		//firstThread.start();//It will call run() automatically
		//secondThread.start();
		//we have 2 threads 1)main 2)firstthread
		
		Thread threadone=new Thread(firstThread);
		Thread threadtwo=new Thread(secondThread);
		//threadtwo.setPriority(Thread.MIN_PRIORITY+3);
		threadone.start();
		threadtwo.start();
		

	}

}
class FirstThreadd implements Runnable{
	Resource resource;
	public FirstThreadd(Resource resource) {
		this.resource=resource;
	}
	public void run() {
		resource.display("first thread");
		
	}
	
	
}
class SecondThreadd implements Runnable{
	Resource resource;
	public SecondThreadd(Resource resource) {
		this.resource=resource;
	}
	public void run() {
		resource.display("second thread");
		
	}
	
	
}
class Resource
{
	public  void display(String message)
	{
		synchronized(this)
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println(message+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		}
	}
}
