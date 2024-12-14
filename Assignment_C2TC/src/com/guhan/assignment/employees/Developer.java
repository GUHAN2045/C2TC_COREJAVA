package com.guhan.assignment.employees;

public class Developer extends Employee {
	  private String programmingLanguage;

	    /**
	     * Gets the programming language of the developer.
	     * @return the programming language of the developer.
	     */
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    /**
	     * Sets the programming language of the developer.
	     * @param programmingLanguage the programming language to set.
	     */
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	
}
