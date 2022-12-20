package com.bhavna.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	Employee findById(int id);

}
