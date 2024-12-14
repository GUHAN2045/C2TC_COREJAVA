package com.guhan.assignment.utilities;

import com.guhan.assignment.employees.Employee;
import com.guhan.assignment.employees.Manager;
import com.guhan.assignment.employees.Developer;
public class EmployeeUtilities {
	public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            System.out.println("Department: " + ((Manager) employee).getDepartment());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }
}
/**
 * Prints details of an employee.
 * @param employee the employee whose details are to be printed.
 */