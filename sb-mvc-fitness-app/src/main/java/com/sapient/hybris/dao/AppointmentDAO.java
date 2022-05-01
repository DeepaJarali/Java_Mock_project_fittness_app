package com.sapient.hybris.dao;

import java.util.List;

import com.sapient.hybris.model.Appointment;

public interface AppointmentDAO {
	public abstract Appointment getAppointmentById(Integer training_appointment_id) throws Exception;
	public abstract List<Appointment> getAppointment() throws Exception;
	public abstract String addAppointment(Appointment appointment) throws Exception;
	public abstract String deleteAppointment(Integer training_appointment_id) throws Exception;
	public abstract String updateAppointment(Appointment appointment) throws Exception;
}
