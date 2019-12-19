package com.mindgate.pojo;

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
		System.out.println("With Three Param. Constructor called");
	}

	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
		System.out.println("Employee Object is created !!");
		System.out.println("With Two Param. Constructor called");
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
