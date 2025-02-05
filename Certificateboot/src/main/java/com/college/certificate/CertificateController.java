package com.college.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CertificateController {
	
	@Autowired
	CertificateService service;
	@GetMapping("/")
	public String Show() {
		return service.Home();
	}
	
	@GetMapping("/certificate")
	public List<Certificate> getAllCertificates(){
		return service.getAllcertificate();
	}
	
	@GetMapping("/certificate/{Student_RegisterNo}")
	public Certificate getCertificateByStudentRegisterNo(@PathVariable("Student_RegisterNo") int Student_RegisterNo) {
		return service.getCertificateByStudentRegisterNo(Student_RegisterNo);
	}
	
	@PutMapping("/certificate")
	public String UpdateStudent(@RequestBody Certificate certificate) {
		service.UpdateCertificate(certificate);
		return "Certificate Updated...";
	}
	
	@PostMapping("/certificate")
	
	public String AddCertificate(@RequestBody Certificate certificate) {
		service.Addcertificate(certificate);
		return "certificate Added....";
	}
	@GetMapping("/about")
	public String career() {
		System.out.println(" This is Careers Pages....");
		return "This is About Page";
	}
	
	@DeleteMapping("/student/{Student_RegisterNo}")
	public String deleteStudentCertificate(@PathVariable int Student_RegisterNo ) {
		service.deleteStudentCertificates(Student_RegisterNo);
		return "Student Certificate Deleted...";
	}
	
	@DeleteMapping("/students/clear")
	public String deleteAllcertificates() {
		service.AllCertificateDelete();
		return " All Certifcates has to be Deleted....!";
	}
	
	

}
