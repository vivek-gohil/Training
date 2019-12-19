package com.mindgate.pojo;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Employee Object is created !!");
		System.out.println("Default Constructor called");
	}

	public Employee(int employeeId, String name, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Object is created !!");
		System.out.println("Param. Constructor called");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
