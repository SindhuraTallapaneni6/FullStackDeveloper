package com.cts.day13;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\HP\\Desktop\\prgm\\example.txt";
		FileOutputStream fout=new FileOutputStream(path,true);//for appending the data into file
		File file= new File(path);//another way
		//String msg="welcome to file handling";
		System.out.println("Can Execute ? :"+file.canExecute());
		System.out.println("Can Read ? :"+file.canRead());
		System.out.println("Can Write ? :"+file.canWrite());
		System.out.println("File Exists ? :"+file.exists());
		System.out.println("Write Data ? :"+file.getAbsolutePath());
		System.out.println(" File Name:"+file.getName());
		System.out.println("Write Data? :");
		
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		byte b[]=msg.getBytes();//converting String to byte array
		fout.write(b);
		fout.close();
		
	}
}
