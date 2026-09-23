package com.example.demo.models;

//import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity//table
//@Table(name = "Employee_data")
public class Employee {
	
	@Id//pk
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Column(nullable = false)
	private String name;
	private String department;
	@Column(unique = true)
	private String email;
	private int salary = 5000;
	
	
	
	// getter and setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
