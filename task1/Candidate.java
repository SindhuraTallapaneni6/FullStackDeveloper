import java.util.Scanner;
class Candidate{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the individual scores in two tests");
		int test1=scan.nextInt();
		int test2=scan.nextInt();
		int avgscore=(test1+test2)/2;
		if(test1>75 && test2>75 && avgscore>=80)
		{
			System.out.println("call letter is sent");
		}
		else
		{
			System.out.println("sorry u are rejected as you not cleared the test");
		}
	}
}