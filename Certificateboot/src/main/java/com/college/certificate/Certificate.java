package com.college.certificate;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 * 
 */
@Entity
public class Certificate {
	@Id
	private int Student_RegisterNo;
	private String Student_Name;
	private String Dept;
	private String Year;
	private int Certificate_No;
	private String Date_Of_Issued; 
	private String Domain_Name;
	
	
	public Certificate(String student_Name, int student_RegisterNo, String dept, String year, int certificate_No,
			String date_Of_Issued, String domain_Name) {
		super();
		Student_Name = student_Name;
		Student_RegisterNo = student_RegisterNo;
		Dept = dept;
		Year = year;
		Certificate_No = certificate_No;
		Date_Of_Issued = date_Of_Issued;
		Domain_Name = domain_Name;
	}


	public String getStudent_Name() {
		return Student_Name;
	}


	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}


	public int getStudent_RegisterNo() {
		return Student_RegisterNo;
	}


	public void setStudent_RegisterNo(int student_RegisterNo) {
		Student_RegisterNo = student_RegisterNo;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	public String getYear() {
		return Year;
	}


	public void setYear(String year) {
		Year = year;
	}


	public int getCertificate_No() {
		return Certificate_No;
	}


	public void setCertificate_No(int certificate_No) {
		Certificate_No = certificate_No;
	}


	public String getDate_Of_Issued() {
		return Date_Of_Issued;
	}


	public void setDate_Of_Issued(String date_Of_Issued) {
		Date_Of_Issued = date_Of_Issued;
	}


	public String getDomain_Name() {
		return Domain_Name;
	}


	public void setDomain_Name(String domain_Name) {
		Domain_Name = domain_Name;
	}


	public Certificate() {
		super();
	}
	
	//getter and setter
	
	
	
	

	
	
}
