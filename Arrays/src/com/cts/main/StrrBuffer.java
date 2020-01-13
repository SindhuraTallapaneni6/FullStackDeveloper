package com.cts.main;

public class StrrBuffer {
public static void main(String args[]) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	//sb.append("thoraipakkam");
	//System.out.println(sb.capacity());
	//sb.append("chennai");
	System.out.println(sb.append("sindhu"));
	System.out.println(sb.insert(2, "hai" ));
	System.out.println(sb.delete(2, 5));
	System.out.println(sb.replace(4 , 6, "si"));
	
	
}

}

