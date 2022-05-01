package com.sapient.hybris.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.hybris.dao.AppointmentDAO;

import com.sapient.hybris.model.Appointment;


	@Service
	@Transactional
	public class AppointmentServiceImpl implements AppointmentService {
		
		@Autowired
	   private AppointmentDAO appointmentDAO;
		
		@Override
		public Appointment getAppointmentById(Integer training_appointment_id)
				throws AppointmentException {
			try {
				Appointment appointment= appointmentDAO.getAppointmentById(training_appointment_id);
				
				return appointment; 
			}catch(SQLException e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}catch(Exception e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}
		}

		@Override
		public List<Appointment> getAppointment() throws AppointmentException {
			try {
				List<Appointment> appointmentList= appointmentDAO.getAppointment();			
				return appointmentList; 
			}catch(SQLException e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}catch(Exception e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}
		}

		@Override
		public String addAppointment(Appointment appointment) throws AppointmentException {
			try {			
				return appointmentDAO.addAppointment(appointment); 
			}catch(SQLException e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}catch(Exception e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}
		
		}

		@Override
		public String deleteAppointment(Integer training_appointment_id) throws AppointmentException {
			try {			
				return appointmentDAO.deleteAppointment(training_appointment_id);
			}catch(SQLException e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}catch(Exception e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}
		}

		@Override
		public String updateAppointment(Appointment appointment) throws AppointmentException {
			try {			
				return appointmentDAO.updateAppointment(appointment);
			}catch(SQLException e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}catch(Exception e) {
				
				throw new AppointmentException(e.getMessage(),e);
			}
		}

	}


