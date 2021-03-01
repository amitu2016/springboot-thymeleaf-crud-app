package com.amitu.springbootthymeleafcrudapp.service;

import java.util.List;

import com.amitu.springbootthymeleafcrudapp.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	void deleteEmployeeById(long id);

}
