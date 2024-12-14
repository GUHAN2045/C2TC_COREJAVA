package com.guhan.assignment.employees;

public class Manager extends Employee{
	private String department;
    /**
     Gets the department of the manager.
      @return the department of the manager.
     */
    public String getDepartment() {
        return department;
    }
    /**
     * Sets the department of the manager.
     * @param department the department to set.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
