package com.cts.stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.serial.EmployeeStream;

public class StreamAPI {
public static void main(String[] args) {
List<EmployeeStream> employees=new ArrayList<EmployeeStream>();
addEmployees(employees);

//age less than 22
List<EmployeeStream> ageScale = employees.stream().filter(emp ->emp.getAge()<22 && emp.getName().equals("sindhu")).collect(Collectors.toList());
ageScale.forEach(System.out::println);
List<EmployeeStream> salaryScale = employees.stream().map(emp -> {
	emp.setSalary(emp.getSalary()*1.1);
	return emp;}).collect(Collectors.toList());
System.out.println("salary after Increment");
salaryScale.forEach(System.out::println);


}




private static void addEmployees(List<EmployeeStream> employees)
{
	EmployeeStream emp1=new EmployeeStream(211,"abin",22,536478L,87657);
	EmployeeStream emp2=new EmployeeStream(212,"tanu",23,5987685L,87654);
	EmployeeStream emp3=new EmployeeStream(213,"ram",22,857467l,578945);
	EmployeeStream emp4=new EmployeeStream(214,"sindhu",21,76547678L,768759);
	EmployeeStream emp5=new EmployeeStream(215,"divya",20,87789L,24356);
	
	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	employees.add(emp4);
	employees.add(emp5);
	
}
}
