package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Patient;
import com.example.repository.Patientrepository;

@Service
public class Patientservice {

	@Autowired
	private Patientrepository patientRepository;
	
	public List<Patient> getallpatients(){
		return patientRepository.findAll();
	}
    
	public Patient addpatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public Patient updatepatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public void deletepatient(int id) {
		patientRepository.deleteById(id);
	}

	public Patient getpatientbyid(int id) {
	    return patientRepository.findById(id).orElse(null);
	}

}
