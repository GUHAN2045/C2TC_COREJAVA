package com.college.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {

	
	@Autowired
	CertificateRepository CertificateRepository;
	public String Home() {
		return "Vanakkam";
	}
	public List<Certificate> getAllcertificate() {
		// TODO Auto-generated method stub
		return CertificateRepository.findAll();
	}
	public void Addcertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		CertificateRepository.save(certificate); //Add certificate
	}
	
	public void UpdateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		CertificateRepository.save(certificate); //update
		
	}
	public Certificate getCertificateByStudentRegisterNo(int Student_RegisterNo) {
		// TODO Auto-generated method stub
		return CertificateRepository.findById(Student_RegisterNo).orElse(new Certificate());    // Option for dummy Student=null
	
	}
	public void deleteStudentCertificates(int student_RegisterNo) {
		// TODO Auto-generated method stub
		CertificateRepository.deleteById(student_RegisterNo);
	}
	public void AllCertificateDelete() {
		CertificateRepository.deleteAll();
		// TODO Auto-generated method stub
		
	}
	
}
