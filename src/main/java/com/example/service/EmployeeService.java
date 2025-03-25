package com.example.service;
import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee emp);
	
	Employee updateEmployee(Employee emp);
	
	Optional<Employee> getEmployeeById(int empid);
	
	String deleteEmployee(int empid);
	
	List<Employee> getAllEmployee();

}
