package com.cts.activity.daoimpl;

import java.sql.Connection;


public class EmployeeDAOImpl implements EmployeeDAO{
	static Connection conn=null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="admin";
		}
	}

	@Override
	public boolean addEmployee(Employee employee) {
		
		try {
			list.add(employee);
			return true;
		} catch (Exception e) {
		
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		for(Employee emp :list )
		{
			
			if(emp.getId()==employee.getId()) {
				list.set(list.indexOf(emp),employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		
//		try {
//			list.remove(employee);
//			return true;
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public Employee getEmployeeById(int id) {
	
	for(Employee employee :list) {
		if(employee.getId() == id) {
		return	employee;
		}
	}
 		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}
