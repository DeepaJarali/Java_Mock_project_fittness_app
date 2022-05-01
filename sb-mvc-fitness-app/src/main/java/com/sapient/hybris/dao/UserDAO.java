package com.sapient.hybris.dao;

import com.sapient.hybris.model.User;

public interface UserDAO {
	public abstract Boolean isValidCredentials(String username,String password) throws Exception;
	public abstract String addUser(User user) throws Exception;
	public abstract String deleteUser(Integer userid) throws Exception;
	public abstract String changePassword(Integer userid,String oldPassword, String newPassword) throws Exception; 
}
