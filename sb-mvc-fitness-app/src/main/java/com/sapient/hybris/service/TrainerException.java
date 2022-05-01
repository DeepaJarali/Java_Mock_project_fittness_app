package com.sapient.hybris.service;

public class TrainerException extends Exception{
	public TrainerException() {
		super();
	}
	
	public TrainerException(String message) {
		super(message);
	}
	
	public TrainerException(String message,Throwable t) {
		super(message,t);
	}
}
