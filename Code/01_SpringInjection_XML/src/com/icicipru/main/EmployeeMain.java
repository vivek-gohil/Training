package com.icicipru.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icicipru.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		// creating object without spring
		Employee employee = new Employee();

		System.out.println("----------------------------------------------------");
		// Injecting Employee object using spring

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("----------------------------------------------------");
		Employee employee2 = applicationContext.getBean("emp", Employee.class);
		Employee employee3 = applicationContext.getBean("emp", Employee.class);
		Employee employee4 = applicationContext.getBean("emp", Employee.class);
		Employee employee5 = applicationContext.getBean("emp", Employee.class);

		System.out.println("----------------------------------------------------");
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);

	}
}
