package com.sapient.hybris.service;

import java.util.List;

import com.sapient.hybris.model.Appointment;

public interface AppointmentService {
	public abstract Appointment getAppointmentById(Integer training_appointment_id) throws AppointmentException;
	public abstract List<Appointment> getAppointment() throws AppointmentException;
	public abstract String addAppointment(Appointment appointment) throws AppointmentException;
	public abstract String deleteAppointment(Integer training_appointment_id) throws AppointmentException;
	public abstract String updateAppointment(Appointment appointment) throws AppointmentException;
}

