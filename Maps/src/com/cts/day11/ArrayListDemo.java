package com.cts.day11;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee(211,"divya",22,7867546372L,765463.00);
		Employee emp2=new Employee(101,"sindhu",22,7867546562L,76563.00);
		Employee emp3=new Employee(102,"malavika",22,7845326372L,76546343.00);
		Employee emp4=new Employee(211,"ram",26,7867435372L,7656763.00);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println(list);
		//Collections.sort(list);
		System.out.println(list);
	}

}
