package com.admin.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.admin.springboot.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String> {

}
