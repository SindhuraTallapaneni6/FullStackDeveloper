package com.cts.day11;

import java.util.Comparator;

public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
	private double phone;
	public Employee(int id, String name, int age, double phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+ ":" +name+ ":"+age+":" +phone+":"+salary;
	}
	

}
class SortById implements Comparator<Employee>{
	
	
}
