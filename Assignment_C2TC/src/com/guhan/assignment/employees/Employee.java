package com.guhan.assignment.employees;

public class Employee {
	
	    private String name;
	    private int employeeId;
	    private double salary;

	    public String getName() {
	        return name;
	    } /**
	     * Gets the name of the employee.*/
	   
	    public void setName(String name) {
	        this.name = name;
	        /**
	         * Sets the name of the employee.*/
	    }
	     public int getEmployeeId() {
	            return employeeId;
	        }/**
	     * Gets the employee ID.*/
	     public void setEmployeeId(int employeeId) {
	            this.employeeId = employeeId;
	        }
	     /**
	     * Gets the employee ID.*/
	    public double getSalary() {
	            return salary;
	    } /**
	     * Sets the salary of the employee.
	     */
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
}

