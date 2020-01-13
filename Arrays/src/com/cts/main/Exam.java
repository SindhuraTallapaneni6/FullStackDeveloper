package com.cts.main;

public class Exam {
	public static void main(String args[]) {
		String name1="arjun";
		String name2="bheem";
		String name6="arjun";
		String name3=new String("arjun");
		String name4=new String("sahadev");
		String name5=new String("sahadev");
		
		//System.out.println(name1.equals(name3));
		//System.out.println(name1==name6);
		//System.out.println(name4==name5);
		
		String date="Thursday 9 January 2020";
		for(int i=0;i<date.length();i++)
		{
		String [] date1=date.split("\\d");
		
		System.out.println(date1[i]);
		}
	}

}
