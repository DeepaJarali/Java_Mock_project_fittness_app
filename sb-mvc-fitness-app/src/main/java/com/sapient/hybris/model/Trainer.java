package com.sapient.hybris.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Trainer {
	private Integer trainer_id;
	private String trainer_name;
	private String trainer_gender;
	private Integer trainer_age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateofjoin;
	private Integer trainer_contact;
	private String trainer_experience;
	private String trainer_email;
	
	
	public Trainer() {
		
	}
   
	public Trainer(Integer trainer_id, String trainer_name, String trainer_gender, Integer trainer_age,
			LocalDate dateofjoin, Integer trainer_contact, String trainer_experience, String trainer_email) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.trainer_gender = trainer_gender;
		this.trainer_age = trainer_age;
		this.dateofjoin = dateofjoin;
		this.trainer_contact = trainer_contact;
		this.trainer_experience = trainer_experience;
		this.trainer_email = trainer_email;
	}

	public Integer getTrainer_id() {
		return trainer_id;
	}


	public void setTrainer_id(Integer trainer_id) {
		this.trainer_id = trainer_id;
	}


	public String getTrainer_name() {
		return trainer_name;
	}


	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}


	public String getTrainer_gender() {
		return trainer_gender;
	}


	public void setTrainer_gender(String trainer_gender) {
		this.trainer_gender = trainer_gender;
	}


	public Integer getTrainer_age() {
		return trainer_age;
	}


	public void setTrainer_age(Integer trainer_age) {
		this.trainer_age = trainer_age;
	}


	public LocalDate getDateofjoin() {
		return dateofjoin;
	}


	public void setDateofjoin(LocalDate dateofjoin) {
		this.dateofjoin = dateofjoin;
	}


	public Integer getTrainer_contact() {
		return trainer_contact;
	}


	public void setTrainer_contact(Integer trainer_contact) {
		this.trainer_contact = trainer_contact;
	}


	public String getTrainer_experience() {
		return trainer_experience;
	}


	public void setTrainer_experience(String trainer_experience) {
		this.trainer_experience = trainer_experience;
	}


	public String getTrainer_email() {
		return trainer_email;
	}


	public void setTrainer_email(String trainer_email) {
		this.trainer_email = trainer_email;
	}
	
	
}

