package com.cts.main;
import java.util.*;
public class Global {
   public static void main(String args[]) {
	
	//StringBuffer sb=new StringBuffer();
//	Scanner scan=new Scanner(System.in);
	String str="Global Warming";
	System.out.println(str.substring(10));
	System.out.println(str.substring(4,8));
	System.out.println(str.toLowerCase());
	System.out.println(str.replace('a' ,'*'));
	System.out.println(str.matches("[a-zA-Z0-9]+"));
	System.out.println(str.indexOf("Wa"));
	System.out.println(str.substring(0,str.length()-4));
	System.out.println(str.substring(3,14));
	
	
   }

}
