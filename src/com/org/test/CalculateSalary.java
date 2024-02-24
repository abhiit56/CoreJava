/**
 * 
 */
package com.org.test;

import java.util.Scanner;

/**
 * This class will calculate salary of employee.
 */
public class CalculateSalary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee = new Employee();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the employee id: ");
		int empId = scanner.nextInt();
		employee.setEmpId(empId);

		System.out.println("Enter the employee name: ");
		String empName = scanner.next();
		employee.setEmpName(empName);

//		System.out.println("Enter the employee address: ");	
//		String empAddress = scanner.next();
//		employee.setAddress(empAddress);

		System.out.println("Enter the employee salary: ");
		int salary = scanner.nextInt();
		employee.setSalary(salary);

		float pfDeduction = (employee.getSalary() * 12) / 100;
		System.out.println("PF Deduction: " + pfDeduction);

		float hra = (employee.getSalary()) * 40 / 100;
		System.out.println("HRA: " + hra);

		float netSalary = (employee.getSalary() + hra - pfDeduction);

		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Net Salary: " + netSalary);
	}

}
