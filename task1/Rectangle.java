/*Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter*/
import java.util.Scanner;
class Rectangle{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length and breadth of rectangle");
		int l=scan.nextInt();
		int b=scan.nextInt();
		int c=l+b;
		System.out.println("area is"+l*b);
		System.out.println("perimeter is"+2*c);
	}
}