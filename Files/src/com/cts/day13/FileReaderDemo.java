package com.cts.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class FileReaderDemo {
public static void main(String[] args) throws IOException {
	String path="C:\\Users\\HP\\Desktop\\prgm\\example.txt";
	FileReader reader=new FileReader(path);
	FileWriter writer=new FileWriter("example.txt");
	writer.write("hello");
	//Scanner scan=new Scanner(System.in);
	//String msg=scan.nextLine();
	//byte b[]=msg.getBytes();//converting String to byte array
	reader.close();
	writer.close();
}
}
