package com.cts.day10;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		PriorityQueue<Integer> list=new PriorityQueue<>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		//System.out.println(list);
		//ArrayList names=new ArrayList();
		//names.add("sindhu");
		//names.add("tanu");
		//names.add("malavika");
		//list.addAll(names);
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.poll());
		System.out.println(list.remove(2));
		System.out.println(list.element());
		System.out.println(list);
	}
}
