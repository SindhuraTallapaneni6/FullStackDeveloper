/*You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.*/
import java.util.Scanner;
class Product{
	public static void main(String args[])
	{	
		int up=10;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Productname");
		String pn=scan.nextLine();
		System.out.println("enter Product Quantity");
		int pq=scan.nextInt();
		
		System.out.println("The total price of the product" +pn+ "is"+pq*up);

	}
}