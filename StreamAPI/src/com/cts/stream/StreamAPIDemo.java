package com.cts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		addNames(names);
		names.forEach(System.out::println);
		List<String> lengthScale =names.stream().filter(s -> s.length() >=7).collect(Collectors.toList());
		System.out.println("the names which has length greater than 7: \n");
		lengthScale.forEach(System.out::println);
		//print all capital letters
		//List<String> capNames() =names.parallelStream().map(name -> name.toUpperCase()).collect(Collectors.toList());
	}
	private static void addNames(List<String> names) {
		names.add("Abin Joshy");
		names.add("Sai Krishna");
		names.add("Aniket");
		names.add("Nagasri");
		names.add("syed");
		
	}

}
