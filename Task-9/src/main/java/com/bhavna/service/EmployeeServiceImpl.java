package com.bhavna.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.dao.EmployeeDao;
import com.bhavna.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee save = this.dao.save(employee);
		return save;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> find = this.dao.findAll();
		return find;
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		Employee update = this.dao.findById(id);
		employee.setId(employee.getId());
		employee.setName(employee.getName());
		employee.setSalary(employee.getSalary());
		employee.setAge(employee.getAge());
		employee.setGender(employee.getGender());
		employee.setJobTitle(employee.getJobTitle());
		
		Employee updatedEmployee = this.dao.save(update);
		return updatedEmployee;
	}

	@Override
	public void deleteEmployee(int id) {
		Employee delete = this.dao.findById(id);
		this.dao.delete(delete);
		
	}

}
