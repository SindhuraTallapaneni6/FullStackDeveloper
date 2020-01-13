package com.cts.main;
import java.util.Scanner;
public class One {
	public static void main(String args[]) {
		Count co=new Count();
		co.range();
	}

}
class Count{

	public void range() {
		Scanner scan=new Scanner(System.in);
		int c=0;
	System.out.println("Enter the range to count 1");
	int n1=scan.nextInt();
	int n2=scan.nextInt();
	for(int i=n1;i<=n2;i++)
	{
		int n3=i;

	
			while(n3>0)
			{
				int s=n3%10;
				n3=n3/10;
				if(s==1)
				{
				c=c+1;
				}
				
			}
			

	}
	System.out.println("The no of ones in the given range are" +c);
	
}
}