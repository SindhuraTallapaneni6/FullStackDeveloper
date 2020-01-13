/*Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.*/
import java.util.Scanner;

class Number{
public static void main(String args[]){
 System.out.println("enter any number");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n>0)
{
	System.out.println("positive");
}
else if(n<0)
{
        System.out.println("Negative");
}
else
	System.out.println("zero");
}
}