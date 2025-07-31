package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Patient;

public interface Patientrepository extends JpaRepository<Patient,Integer>{

}
