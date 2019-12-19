package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeJDBCMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO dao = applicationContext.getBean("employeeDAO", EmployeeDAO.class);

		// Employee employee = new Employee(103, "Raj", 1090);

		// dao.addEmployee(employee);

		// dao.updateEmployeeSalary(103, 100000);

		// dao.deleteEmployee(103);

		// Employee employee = dao.getEmployee(101);

		List<Employee> empList = dao.getAllEmployees();

		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
