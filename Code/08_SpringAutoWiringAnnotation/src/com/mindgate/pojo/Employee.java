package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	@Autowired
	private Address address;

	public Employee() {
		System.out.println("Employee object is created ");
	}

	public Employee(int employeeId, String name, double salary, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ "]";
	}

}
