package com.cts.serial;

import java.io.Serializable;

public class EmployeeStream implements Serializable{
	private static final long  serialVersionUID=57865897985895L;
	private int id;
	private String name;
	private int age;
	transient private double salary;
	private double phone;
	public EmployeeStream()
	{
		
	}
	
	public EmployeeStream(int id, String name, int age, double phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
		this.phone = phone;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return id+ ":" +name+ ":"+age+":" +phone+":"+salary;
	}
	

}
