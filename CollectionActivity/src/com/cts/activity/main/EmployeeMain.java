package com.cts.activity.main;



import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;

public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeDAO employeeDAO =new EmployeeDAOImpl();
		
		//Employee emp=employeeDAO.getEmployeeById(1);
		//System.out.println(emp);
		Employee employee=new Employee(212,"bheem",22,7866746372L,765463.00);
		
		boolean status=employeeDAO.addEmployee(employee);
		//delete
		Employee delEmployee=employeeDAO.getEmployeeById(101);
		boolean status1=employeeDAO.deleteEmployee(delEmployee);
		//update
		Employee updateEmployee=employeeDAO.getEmployeeById(211);
		updateEmployee.setAge(23);
		boolean status2=employeeDAO.updateEmployee(updateEmployee);
		if(status2)
		{
			System.out.println("update successfully");
			
		}
		else
		{
			System.out.println("updation not done");
		}
		List<Employee> list=employeeDAO.getAllEmployees();
		for(Employee employee1 : list) {
		System.out.println(employee1);
	}

}
}
