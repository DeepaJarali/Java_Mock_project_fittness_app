package com.sapient.hybris.service;

import com.sapient.hybris.model.User;

public interface UserService {
	public abstract Boolean isValidCredentials(String username,String password) throws CredentialException;
	public abstract String addUser(User user) throws CredentialException;
	public abstract String deleteUser(Integer userid) throws CredentialException;
	public abstract String changePassword(Integer userid,String oldPassword, String newPassword) throws CredentialException; 
}
