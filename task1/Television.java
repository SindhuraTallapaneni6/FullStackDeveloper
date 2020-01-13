/*Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.*/
import java.util.Scanner;
class Television{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter type of tv");
		String pn=scan.nextLine();
		if(pn.equals("LCD"))
		{
			System.out.println("Enter the size of screen");
			int size=scan.nextInt();
			if(size==14)
			{
				System.out.println("The discount is 8% of sp");
			}
			else if(size==21)
			{
				System.out.println("The discount is 10% of sp");
			}
			else
				System.out.println("No other size is available");
		}
		else if(pn.equals("CRT"))
		{
			System.out.println("The discount is 5% of sp");
		}
		else
			System.out.println("No other type is available");


	}
}  