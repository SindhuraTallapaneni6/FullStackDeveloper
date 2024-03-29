package com.cts.activity.dao;


import java.util.List;

import com.cts.activity.bean.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
}
