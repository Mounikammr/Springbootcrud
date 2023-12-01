package com.admin.springboot.bean;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	private int Id;
	private String name;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
