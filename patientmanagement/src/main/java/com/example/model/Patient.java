package com.example.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class Patient {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;
	   private String name;
	   private int age;
	   private String gender;
	   private String diagnosis;
	   private LocalDate admissiondate;
	   private String status;
	   
	public int getPatientid() {
		return id;
	}
	public void setPatientid(int patientid) {
		this.id = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public LocalDate getDate() {
		return admissiondate;
	}
	public void setDate(LocalDate date) {
		this.admissiondate = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Patient(int patientid, String name, int age, String gender, String diagnosis, LocalDate date, String status) {
	
		this.id = patientid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.diagnosis = diagnosis;
		this.admissiondate = date;
		this.status = status;
	}
   
   public Patient() {
	   super();
   }
	@Override
	public String toString() {
		return "Patient [patientid=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", diagnosis="
				+ diagnosis + ", date=" + admissiondate + ", status=" + status + "]";
	}
   
   

}
