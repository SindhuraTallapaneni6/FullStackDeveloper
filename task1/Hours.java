import java.util.Scanner;
class Hours{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of hours");
		int hours=scan.nextInt();
		System.out.println("enter no of resourses");
		int res=scan.nextInt();
		System.out.println("Total number of productive hours is "+hours*res);
	}
}