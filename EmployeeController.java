package com.admin.psringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.springboot.bean.Employee;
import com.springboot.springbootCRUD.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService empl0yeeservice;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return empl0yeeservice.getAllEmployees();
	}
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmployee(@RequestBody Employee employee )
	{
		empl0yeeservice.addService(employee);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/employee/{id}")
	public void updateEmployee(@PathVariable String id,@RequestBody Employee employee )
	{
		empl0yeeservice.updateEmployee(id,employee);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/employee/{id}")
	public void deleteEmployee(@PathVariable String id )
	{
		empl0yeeservice.deleteEmployee(id);
	}
}
