package com.cts.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {
	public static void main(String[] args) throws IOException {
		//path interface which is used to create path
//		FileSystem fs=FileSystems.getDefault();
//		Path path=fs.getPath("C:\\Users\\HP\\Desktop\\Javaprogram");
		Path path=Paths.get("C:","Users","HP","Desktop","Javaprogram");
		Path path1=Paths.get("C:","Users","HP","Desktop","prgm","daa.txt");
		System.out.println("Name count:" +path.getNameCount());
		System.out.println(" Is absolute :"+path.isAbsolute());
		System.out.println("Name On Index:"+path.getName(2));
		//Files.createFile(path1);
		//Files.createDirectory(path1);
		//Files.createDirectories(path1);
	
	
	}

}
