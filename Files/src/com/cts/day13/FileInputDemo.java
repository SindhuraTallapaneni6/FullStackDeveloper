package com.cts.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileInputDemo {
public static void main(String[] args) throws IOException {
	String path="C:\\Users\\HP\\Desktop\\prgm\\example.txt";
	FileInputStream fin=new FileInputStream(path);
	FileOutputStream fout=new FileOutputStream("copied.txt");//copying one file to another
	int i;
	while((i=fin.read()) != -1) {
		//System.out.println((char)i);
		fout.write(i);
	}
	fout.close();
	fin.close();
}
}
