package com.sapient.hybris.service;

public class AppointmentException extends Exception{
	public AppointmentException() {
		super();
	}
	
	public AppointmentException(String message) {
		super(message);
	}
	
	public AppointmentException(String message,Throwable t) {
		super(message,t);
	}
}
