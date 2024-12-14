package com.guhan.assignment;

import com.guhan.assignment.employees.*;
import com.guhan.assignment.utilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create instances of Manager and Developer
		        Manager manager = new Manager();
		        manager.setEmployeeId(1);
		        manager.setName("Alice");
		        manager.setSalary(75000);
		        manager.setDepartment("HR");
		        
		        Developer developer = new Developer();
		        developer.setEmployeeId(2);
		        developer.setName("Guhan");
		        developer.setSalary(65000);
		        developer.setProgrammingLanguage("Java");
		        
		        // Use EmployeeUtilities to print details
		        EmployeeUtilities utilities = new EmployeeUtilities();
		        System.out.println("Manager Details:");
		        utilities.printEmployeeDetails(manager);
		        System.out.println("\nDeveloper Details:");
		        utilities.printEmployeeDetails(developer);
	}

}
