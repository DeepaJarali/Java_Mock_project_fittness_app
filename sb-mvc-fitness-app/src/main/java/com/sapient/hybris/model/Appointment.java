package com.sapient.hybris.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Appointment {
	private Integer training_appointment_id;
	private String first_name;
	private String last_name;
	private String address;
	private String email;
	private Integer age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	private String gender;
	private Long contact;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate training_start_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate training_end_date;
	private String physio;
	private Double training_package_amount;
	
	
    public Appointment() {
    	
    }


	public Appointment(Integer training_appointment_id, String first_name, String last_name, String address,
			String email, Integer age, LocalDate birthdate, String gender, Long contact,
			 LocalDate training_start_date, LocalDate training_end_date, String physio,
			Double training_package_amount) {
		super();
		this.training_appointment_id = training_appointment_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.email = email;
		this.age = age;
		this.birthdate = birthdate;
		this.gender = gender;
		this.contact = contact;
		this.training_start_date = training_start_date;
		this.training_end_date = training_end_date;
		this.physio = physio;
		this.training_package_amount = training_package_amount;
	}


	public Integer getTraining_appointment_id() {
		return training_appointment_id;
	}


	public void setTraining_appointment_id(Integer training_appointment_id) {
		this.training_appointment_id = training_appointment_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getContact() {
		return contact;
	}


	public void setContact(Long contact) {
		this.contact = contact;
	}


	public LocalDate getTraining_start_date() {
		return training_start_date;
	}


	public void setTraining_start_date(LocalDate localDate) {
		this.training_start_date = localDate;
	}


	public LocalDate getTraining_end_date() {
		return training_end_date;
	}


	public void setTraining_end_date(LocalDate training_end_date) {
		this.training_end_date = training_end_date;
	}


	public String getPhysio() {
		return physio;
	}


	public void setPhysio(String physio) {
		this.physio = physio;
	}


	public Double getTraining_package_amount() {
		return training_package_amount;
	}


	public void setTraining_package_amount(Double training_package_amount) {
		this.training_package_amount = training_package_amount;
	}
    
    
    }