import java.util.Scanner;
class Age{
      public static void main(String args[])
      {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of user");
		int age=scan.nextInt();
		if(age>=5 && age<=12)
		{
			System.out.println("user belongs to children category");
		}
                else if(age>=13 && age<=19)
		{
			System.out.println("user belongs to teenager category");
		} 
		else if(age>=20 && age<=35)
		{
			System.out.println("user belongs to young adults category");
		}
                else if(age>=36 && age<=45)
		{
			System.out.println("user belongs to mature adults category");
		}
		else if(age>=46 && age<=55)
		{
			System.out.println("user belongs to elders category");
		}
		else
		{
			System.out.println("user belongs to senior citizens category");
		}
}
}