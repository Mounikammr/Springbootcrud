package com.springboot.springbootCRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.springboot.bean.Employee;
import com.admin.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	public EmployeeRepository emplyeerepo;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employee=new ArrayList<>();
		emplyeerepo.findAll().forEach(employee::add);
		return employee;
	}

	public void addService(Employee employee) {
		
		emplyeerepo.save(employee);
		
	}

	public void updateEmployee(String id, Employee employee) {
		emplyeerepo.save(employee);
		
	}

	

	public void deleteEmployee(String id) {
		emplyeerepo.deleteById(id);
		
	}

	
	

}
