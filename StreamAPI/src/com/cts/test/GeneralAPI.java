package com.cts.test;

public class GeneralAPI {
	public long add(int a,int b) {
		return a+b;
	}
	public boolean checkEven(int num) {
		if(num%2 == 0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public int getFactorial(int num) {
		if(num==1)
			return 1;
		else
			return num*getFactorial(num-1);
	}
	public boolean getPrime(int num) {
		int i,c=0;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				c=c+1;
			}
		
		}
		if(c==1)
		{
			return true;
		}
		else
			return false;
	}

}
