package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream(fileName);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		Object obj=oin.readObject();
		return obj;

	}
	public static void serialize(Object obj,String fileName) throws IOException {
		FileOutputStream fout=new FileOutputStream(fileName);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out=new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		out.close();
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		EmployeeStream employee=new EmployeeStream(111,"mahesh",23,56478L,5647856);
		
			try {
				serialize(employee,"serial.txt");
				EmployeeStream emp=(EmployeeStream) deserialize("serial.txt");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		 
	
		
	}

}
