package com.sapient.hybris.service;

public class CredentialException extends Exception{
	public CredentialException() {
		super();
	}
	
	public CredentialException(String message) {
		super(message);
	}
	
	public CredentialException(String message,Throwable t) {
		super(message,t);
	}
}
