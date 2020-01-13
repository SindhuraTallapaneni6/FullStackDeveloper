import java.util.Scanner;
class Greatest{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b)
		{
			System.out.println("Greatest number is "+a);
		}
		else if(b>c)
		{
			System.out.println(" greatest number is "+b);
		}
		else
			System.out.println(" greatest number is "+c);

	}
}