package com.icicipru.pojo;

import org.springframework.stereotype.Component;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Employee object is created !!");
		System.out.println("Default constructor of Employee");
	}

	public Employee(int employeeId, String name, double salary, Address address) {
		System.out.println("Employee object is created !!");
		System.out.println("Param. constructor of Employee");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("Setting employeeId :: " + employeeId);
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name :: " + name);
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Setting salary :: " + salary);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
