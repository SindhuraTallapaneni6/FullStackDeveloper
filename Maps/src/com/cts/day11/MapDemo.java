 package com.cts.day11;
 import java.util.Map;
 import java.util.LinkedHashMap  ;
 import java.util.HashMap;
 import java.util.Map.Entry;//it is the subinterface of Map so it wont works with java.util.*

public class MapDemo {
	public static void main(String args[]) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("java",3000);
		map.put("c++",4000);
		map.put("c",8000);
		map.put("python",8000);
		//map.put("java",5000);//it will replaces the value but it creates hashtable again so use replace
		map.replace("java",3000,5000);
		  System.out.println(map);
	}

}
