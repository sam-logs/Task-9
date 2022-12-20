package com.bhavna.service;

import java.util.List;

import com.bhavna.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee updateEmployee(Employee employee, int id);

	void deleteEmployee(int id);

}
