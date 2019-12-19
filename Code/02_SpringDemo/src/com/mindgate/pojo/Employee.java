package com.mindgate.pojo;

public class Employee {

	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Employee object is created !!");
		System.out.println("Default constructor called !!");
	}

	public Employee(int employeeId, String name, double salary) {
		System.out.println("Employee object is created !!");
		System.out.println("Param. constructor called !!");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
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
