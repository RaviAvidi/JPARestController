package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.save(emp);
	}

	@Override
	public Optional<Employee> getEmployeeById(int empid) {
			
		return dao.findById(empid);
	}

	@Override
	public String deleteEmployee(int empid) {
		
		dao.deleteById(empid);
		// TODO Auto-generated method stub
		return "Employee deleted";
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> li= dao.findAll();
		return li;
	}

}
