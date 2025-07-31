package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Patient;
import com.example.service.Patientservice;

@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = "*") 

public class PatientController {

	@Autowired
	private Patientservice patientService;
	
	
	@GetMapping
	public List<Patient> getallpatients(){
		return patientService.getallpatients();
	}
	
	 @GetMapping("/{id}")
	    public Patient getPatientById(@PathVariable int id) {
	        return patientService.getpatientbyid(id);
	    }
	
	@PostMapping
	public Patient addpatient(@RequestBody Patient patient) {
		return patientService.addpatient(patient);
	}
	
	@PutMapping
	public Patient updatepatient(@RequestBody Patient patient) {
		return patientService.updatepatient(patient);
	}
	
	@DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patientService.deletepatient(id);
    }
}
