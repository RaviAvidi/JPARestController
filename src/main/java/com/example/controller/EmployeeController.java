package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringbootjdbcRestApi1Application;
import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp)
	{
		service.addEmployee(emp);
		return "Employee Added Successfully";
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp)
	{
		service.updateEmployee(emp);
		return "employee updated successfully...";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@RequestBody @PathVariable("id") int empid)
	{
		 service.deleteEmployee(empid);
//		 System.out.println(str);
		return "Delete sucessfully";
	}
}
